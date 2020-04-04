package cn.strutsDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.struts2.ServletActionContext;

/**
 * Servlet implementation class Uploadphoto
 */
@WebServlet("/Uploadphoto")
public class Uploadphoto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Uploadphoto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			
			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			upload.setHeaderEncoding("utf-8");
			List items = upload.parseRequest(request);
			Map map = new HashMap();
			for (Object obj : items) {
				FileItem fileItem = (FileItem) obj;
				if (fileItem.isFormField()) {
					map.put(fileItem.getFieldName(), fileItem.getString("utf-8"));
				} else {
					if ("file".equals(fileItem.getFieldName())) {
						String filename = fileItem.getName();
						InputStream iStream = fileItem.getInputStream();
						new File("E:/images/").mkdir();
						File file = new File("E:/images/", filename);
						file.createNewFile();
						FileOutputStream fos = new FileOutputStream(file);
						byte[] b = new byte[1024];
						while ((iStream.read(b)) != -1) {
							fos.write(b);
						}
						iStream.close();
						fos.close();
					}
				}
			}
			System.out.println(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
