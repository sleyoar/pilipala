package pojo;

public class Video {
    private Integer videoID;
    private String videoName;
    private String videoImage;
    private String videoAddress;
    private String videolookTime;
    private String videoCollection;
    private String videoLeaving;
    private String videoTime;
    private String videoState;
    private String videoCategory;

    public Video() {
    }

    public Video(Integer videoID, String videoName, String videoImage,
                 String videoAddress, String videolookTime,
                 String videoCollection, String videoLeaving, String videoTime,
                 String videoState, String videoCategory) {
        this.videoID = videoID;
        this.videoName = videoName;
        this.videoImage = videoImage;
        this.videoAddress = videoAddress;
        this.videolookTime = videolookTime;
        this.videoCollection = videoCollection;
        this.videoLeaving = videoLeaving;
        this.videoTime = videoTime;
        this.videoState = videoState;
        this.videoCategory = videoCategory;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoID=" + videoID +
                ", videoName='" + videoName + '\'' +
                ", videoImage='" + videoImage + '\'' +
                ", videoAddress='" + videoAddress + '\'' +
                ", videolookTime='" + videolookTime + '\'' +
                ", videoCollection='" + videoCollection + '\'' +
                ", videoLeaving='" + videoLeaving + '\'' +
                ", videoTime='" + videoTime + '\'' +
                ", videoState='" + videoState + '\'' +
                ", videoCategory='" + videoCategory + '\'' +
                '}';
    }

    public Integer getVideoID() {
        return videoID;
    }

    public void setVideoID(Integer videoID) {
        this.videoID = videoID;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoImage() {
        return videoImage;
    }

    public void setVideoImage(String videoImage) {
        this.videoImage = videoImage;
    }

    public String getVideoAddress() {
        return videoAddress;
    }

    public void setVideoAddress(String videoAddress) {
        this.videoAddress = videoAddress;
    }

    public String getVideolookTime() {
        return videolookTime;
    }

    public void setVideolookTime(String videolookTime) {
        this.videolookTime = videolookTime;
    }

    public String getVideoCollection() {
        return videoCollection;
    }

    public void setVideoCollection(String videoCollection) {
        this.videoCollection = videoCollection;
    }

    public String getVideoLeaving() {
        return videoLeaving;
    }

    public void setVideoLeaving(String videoLeaving) {
        this.videoLeaving = videoLeaving;
    }

    public String getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(String videoTime) {
        this.videoTime = videoTime;
    }

    public String getVideoState() {
        return videoState;
    }

    public void setVideoState(String videoState) {
        this.videoState = videoState;
    }

    public String getVideoCategory() {
        return videoCategory;
    }

    public void setVideoCategory(String videoCategory) {
        this.videoCategory = videoCategory;
    }
}
