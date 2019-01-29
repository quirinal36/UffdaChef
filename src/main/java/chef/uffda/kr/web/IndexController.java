package chef.uffda.kr.web;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import chef.uffda.kr.vo.SiteMap;

@Controller
public class IndexController extends UffdaController {
	@RequestMapping(value= {"/", "/index"}, method=RequestMethod.GET)
	public ModelAndView getIndexView(ModelAndView mv) {
		
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping(value= {"/sitemap"}, method=RequestMethod.GET)
	public ModelAndView getSitemapView(ModelAndView mv, HttpServletRequest req) {
		String realPath = req.getSession().getServletContext().getRealPath("/WEB-INF/views");
		
		File parentDir = new File(realPath);
		File[] listOfFiles = parentDir.listFiles();
		
		//List<File> dir = new ArrayList<File>();
		SiteMap sitemap = new SiteMap();
		
		for(int i=0; i<listOfFiles.length; i++) {
			File curFile = listOfFiles[i];
			
			if(curFile.isDirectory()) {
				sitemap.getDirs().add(getSiteMap(curFile));
			}else {
				sitemap.getFiles().add(curFile.getName().substring(0, curFile.getName().lastIndexOf(".")));
			}
		}
		
		mv.addObject("map", sitemap);
		mv.setViewName("sitemap");
		return mv;
	}
	private SiteMap getSiteMap(File dir) {
		SiteMap sitemap = new SiteMap();
		String dirName = dir.getName();
		sitemap.setDirName(dirName);
		
		File[] listOfFiles = dir.listFiles();
		for(int i=0; i<listOfFiles.length; i++) {
			File curFile = listOfFiles[i];
			
			if(curFile.isDirectory()) {
				
				sitemap.getDirs().add(getSiteMap(curFile));
			}else {
				sitemap.getFiles().add(curFile.getName().substring(0, curFile.getName().lastIndexOf(".")));
			}
		}
		return sitemap;
	}
}
