package single.cherry.imageupdate.entity;

/**
 * 培养信息 status 012是
 * @Author: Cherry
 * @Date: 2018/11/27 9:19
 */
public class TrainingInfo {
    private int id;
    //位置
    private int toid;
    private String serial_num;
    private String cellname;
    private String submission;
    private String batch_num;
    private String cultur_num;
    private String passage_time;
    private String change_liquid_time;
    private String cellnum;
    private String cell_coverage;
    private String remark;

    public TrainingInfo() {
    }

    public TrainingInfo(int toid, String serial_num, String cellname, String submission, String batch_num, String cultur_num, String passage_time, String change_liquid_time, String cellnum, String cell_coverage, String remark) {
        this.toid = toid;
        this.serial_num = serial_num;
        this.cellname = cellname;
        this.submission = submission;
        this.batch_num = batch_num;
        this.cultur_num = cultur_num;
        this.passage_time = passage_time;
        this.change_liquid_time = change_liquid_time;
        this.cellnum = cellnum;
        this.cell_coverage = cell_coverage;
        this.remark = remark;
    }

    public TrainingInfo(int id, int toid, String serial_num, String cellname, String submission, String batch_num, String cultur_num, String passage_time, String change_liquid_time, String cellnum, String cell_coverage, String remark) {
        this.id = id;
        this.toid = toid;
        this.serial_num = serial_num;
        this.cellname = cellname;
        this.submission = submission;
        this.batch_num = batch_num;
        this.cultur_num = cultur_num;
        this.passage_time = passage_time;
        this.change_liquid_time = change_liquid_time;
        this.cellnum = cellnum;
        this.cell_coverage = cell_coverage;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getToid() {
        return toid;
    }

    public void setToid(int toid) {
        this.toid = toid;
    }

    public String getSerial_num() {
        return serial_num;
    }

    public void setSerial_num(String serial_num) {
        this.serial_num = serial_num;
    }

    public String getCellname() {
        return cellname;
    }

    public void setCellname(String cellname) {
        this.cellname = cellname;
    }

    public String getSubmission() {
        return submission;
    }

    public void setSubmission(String submission) {
        this.submission = submission;
    }

    public String getBatch_num() {
        return batch_num;
    }

    public void setBatch_num(String batch_num) {
        this.batch_num = batch_num;
    }

    public String getCultur_num() {
        return cultur_num;
    }

    public void setCultur_num(String cultur_num) {
        this.cultur_num = cultur_num;
    }

    public String getPassage_time() {
        return passage_time;
    }

    public void setPassage_time(String passage_time) {
        this.passage_time = passage_time;
    }

    public String getChange_liquid_time() {
        return change_liquid_time;
    }

    public void setChange_liquid_time(String change_liquid_time) {
        this.change_liquid_time = change_liquid_time;
    }

    public String getCellnum() {
        return cellnum;
    }

    public void setCellnum(String cellnum) {
        this.cellnum = cellnum;
    }

    public String getCell_coverage() {
        return cell_coverage;
    }

    public void setCell_coverage(String cell_coverage) {
        this.cell_coverage = cell_coverage;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
