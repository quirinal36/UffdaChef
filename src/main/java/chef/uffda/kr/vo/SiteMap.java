package chef.uffda.kr.vo;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SiteMap {
	private List<String> files;
	private List<SiteMap> dirs;
	private String dirName;
	
	public SiteMap() {
		files = new ArrayList<>();
		dirs = new ArrayList<>();
	}
	public List<String> getFiles() {
		return files;
	}
	public void setFiles(List<String> files) {
		this.files = files;
	}
	public List<SiteMap> getDirs() {
		return dirs;
	}
	public void setDirs(List<SiteMap> dirs) {
		this.dirs = dirs;
	}
	public String getDirName() {
		return dirName;
	}
	public void setDirName(String dirName) {
		this.dirName = dirName;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}
