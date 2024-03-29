package com.funtl.itoken.service.admin.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_sys_user")
public class TbSysUser {
    @Id
    @Column(name = "user_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private String userCode;

    @Column(name = "login_code")
    private String loginCode;

    @Column(name = "user_name")
    private String userName;

    private String password;

    private String email;

    private String mobile;

    private String phone;

    private String sex;

    /**
     * ͷ
     */
    private String avatar;

    private String sign;

    @Column(name = "wx_openid")
    private String wxOpenid;

    @Column(name = "mobile_imei")
    private String mobileImei;

    @Column(name = "user_type")
    private String userType;

    @Column(name = "ref_code")
    private String refCode;

    @Column(name = "ref_name")
    private String refName;

    @Column(name = "mgr_type")
    private String mgrType;

    @Column(name = "pwd_security_level")
    private Short pwdSecurityLevel;

    @Column(name = "pwd_update_date")
    private Date pwdUpdateDate;

    @Column(name = "pwd_update_record")
    private String pwdUpdateRecord;

    @Column(name = "pwd_question")
    private String pwdQuestion;

    @Column(name = "pwd_question_answer")
    private String pwdQuestionAnswer;

    @Column(name = "pwd_question_2")
    private String pwdQuestion2;

    @Column(name = "pwd_question_answer_2")
    private String pwdQuestionAnswer2;

    @Column(name = "pwd_question_3")
    private String pwdQuestion3;

    @Column(name = "pwd_question_answer_3")
    private String pwdQuestionAnswer3;

    @Column(name = "pwd_quest_update_date")
    private Date pwdQuestUpdateDate;

    @Column(name = "last_login_ip")
    private String lastLoginIp;

    @Column(name = "last_login_date")
    private Date lastLoginDate;

    @Column(name = "freeze_date")
    private Date freezeDate;

    @Column(name = "freeze_cause")
    private String freezeCause;

    @Column(name = "user_weight")
    private Integer userWeight;

    /**
     * ״̬
     */
    private String status;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "update_date")
    private Date updateDate;

    private String remarks;

    @Column(name = "corp_code")
    private String corpCode;

    @Column(name = "corp_name")
    private String corpName;

    @Column(name = "extend_s1")
    private String extendS1;

    @Column(name = "extend_s2")
    private String extendS2;

    @Column(name = "extend_s3")
    private String extendS3;

    @Column(name = "extend_s4")
    private String extendS4;

    @Column(name = "extend_s5")
    private String extendS5;

    @Column(name = "extend_s6")
    private String extendS6;

    @Column(name = "extend_s7")
    private String extendS7;

    @Column(name = "extend_s8")
    private String extendS8;

    @Column(name = "extend_i1")
    private BigDecimal extendI1;

    @Column(name = "extend_i2")
    private BigDecimal extendI2;

    @Column(name = "extend_i3")
    private BigDecimal extendI3;

    @Column(name = "extend_i4")
    private BigDecimal extendI4;

    @Column(name = "extend_f1")
    private BigDecimal extendF1;

    @Column(name = "extend_f2")
    private BigDecimal extendF2;

    @Column(name = "extend_f3")
    private BigDecimal extendF3;

    @Column(name = "extend_f4")
    private BigDecimal extendF4;

    @Column(name = "extend_d1")
    private Date extendD1;

    @Column(name = "extend_d2")
    private Date extendD2;

    @Column(name = "extend_d3")
    private Date extendD3;

    @Column(name = "extend_d4")
    private Date extendD4;

    /**
     * @return user_code
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * @param userCode
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * @return login_code
     */
    public String getLoginCode() {
        return loginCode;
    }

    /**
     * @param loginCode
     */
    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取ͷ
     *
     * @return avatar - ͷ
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置ͷ
     *
     * @param avatar ͷ
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * @return sign
     */
    public String getSign() {
        return sign;
    }

    /**
     * @param sign
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * @return wx_openid
     */
    public String getWxOpenid() {
        return wxOpenid;
    }

    /**
     * @param wxOpenid
     */
    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }

    /**
     * @return mobile_imei
     */
    public String getMobileImei() {
        return mobileImei;
    }

    /**
     * @param mobileImei
     */
    public void setMobileImei(String mobileImei) {
        this.mobileImei = mobileImei;
    }

    /**
     * @return user_type
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * @return ref_code
     */
    public String getRefCode() {
        return refCode;
    }

    /**
     * @param refCode
     */
    public void setRefCode(String refCode) {
        this.refCode = refCode;
    }

    /**
     * @return ref_name
     */
    public String getRefName() {
        return refName;
    }

    /**
     * @param refName
     */
    public void setRefName(String refName) {
        this.refName = refName;
    }

    /**
     * @return mgr_type
     */
    public String getMgrType() {
        return mgrType;
    }

    /**
     * @param mgrType
     */
    public void setMgrType(String mgrType) {
        this.mgrType = mgrType;
    }

    /**
     * @return pwd_security_level
     */
    public Short getPwdSecurityLevel() {
        return pwdSecurityLevel;
    }

    /**
     * @param pwdSecurityLevel
     */
    public void setPwdSecurityLevel(Short pwdSecurityLevel) {
        this.pwdSecurityLevel = pwdSecurityLevel;
    }

    /**
     * @return pwd_update_date
     */
    public Date getPwdUpdateDate() {
        return pwdUpdateDate;
    }

    /**
     * @param pwdUpdateDate
     */
    public void setPwdUpdateDate(Date pwdUpdateDate) {
        this.pwdUpdateDate = pwdUpdateDate;
    }

    /**
     * @return pwd_update_record
     */
    public String getPwdUpdateRecord() {
        return pwdUpdateRecord;
    }

    /**
     * @param pwdUpdateRecord
     */
    public void setPwdUpdateRecord(String pwdUpdateRecord) {
        this.pwdUpdateRecord = pwdUpdateRecord;
    }

    /**
     * @return pwd_question
     */
    public String getPwdQuestion() {
        return pwdQuestion;
    }

    /**
     * @param pwdQuestion
     */
    public void setPwdQuestion(String pwdQuestion) {
        this.pwdQuestion = pwdQuestion;
    }

    /**
     * @return pwd_question_answer
     */
    public String getPwdQuestionAnswer() {
        return pwdQuestionAnswer;
    }

    /**
     * @param pwdQuestionAnswer
     */
    public void setPwdQuestionAnswer(String pwdQuestionAnswer) {
        this.pwdQuestionAnswer = pwdQuestionAnswer;
    }

    /**
     * @return pwd_question_2
     */
    public String getPwdQuestion2() {
        return pwdQuestion2;
    }

    /**
     * @param pwdQuestion2
     */
    public void setPwdQuestion2(String pwdQuestion2) {
        this.pwdQuestion2 = pwdQuestion2;
    }

    /**
     * @return pwd_question_answer_2
     */
    public String getPwdQuestionAnswer2() {
        return pwdQuestionAnswer2;
    }

    /**
     * @param pwdQuestionAnswer2
     */
    public void setPwdQuestionAnswer2(String pwdQuestionAnswer2) {
        this.pwdQuestionAnswer2 = pwdQuestionAnswer2;
    }

    /**
     * @return pwd_question_3
     */
    public String getPwdQuestion3() {
        return pwdQuestion3;
    }

    /**
     * @param pwdQuestion3
     */
    public void setPwdQuestion3(String pwdQuestion3) {
        this.pwdQuestion3 = pwdQuestion3;
    }

    /**
     * @return pwd_question_answer_3
     */
    public String getPwdQuestionAnswer3() {
        return pwdQuestionAnswer3;
    }

    /**
     * @param pwdQuestionAnswer3
     */
    public void setPwdQuestionAnswer3(String pwdQuestionAnswer3) {
        this.pwdQuestionAnswer3 = pwdQuestionAnswer3;
    }

    /**
     * @return pwd_quest_update_date
     */
    public Date getPwdQuestUpdateDate() {
        return pwdQuestUpdateDate;
    }

    /**
     * @param pwdQuestUpdateDate
     */
    public void setPwdQuestUpdateDate(Date pwdQuestUpdateDate) {
        this.pwdQuestUpdateDate = pwdQuestUpdateDate;
    }

    /**
     * @return last_login_ip
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * @param lastLoginIp
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    /**
     * @return last_login_date
     */
    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * @param lastLoginDate
     */
    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    /**
     * @return freeze_date
     */
    public Date getFreezeDate() {
        return freezeDate;
    }

    /**
     * @param freezeDate
     */
    public void setFreezeDate(Date freezeDate) {
        this.freezeDate = freezeDate;
    }

    /**
     * @return freeze_cause
     */
    public String getFreezeCause() {
        return freezeCause;
    }

    /**
     * @param freezeCause
     */
    public void setFreezeCause(String freezeCause) {
        this.freezeCause = freezeCause;
    }

    /**
     * @return user_weight
     */
    public Integer getUserWeight() {
        return userWeight;
    }

    /**
     * @param userWeight
     */
    public void setUserWeight(Integer userWeight) {
        this.userWeight = userWeight;
    }

    /**
     * 获取״̬
     *
     * @return status - ״̬
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置״̬
     *
     * @param status ״̬
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return create_by
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return update_by
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * @param updateBy
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * @return update_date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return corp_code
     */
    public String getCorpCode() {
        return corpCode;
    }

    /**
     * @param corpCode
     */
    public void setCorpCode(String corpCode) {
        this.corpCode = corpCode;
    }

    /**
     * @return corp_name
     */
    public String getCorpName() {
        return corpName;
    }

    /**
     * @param corpName
     */
    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    /**
     * @return extend_s1
     */
    public String getExtendS1() {
        return extendS1;
    }

    /**
     * @param extendS1
     */
    public void setExtendS1(String extendS1) {
        this.extendS1 = extendS1;
    }

    /**
     * @return extend_s2
     */
    public String getExtendS2() {
        return extendS2;
    }

    /**
     * @param extendS2
     */
    public void setExtendS2(String extendS2) {
        this.extendS2 = extendS2;
    }

    /**
     * @return extend_s3
     */
    public String getExtendS3() {
        return extendS3;
    }

    /**
     * @param extendS3
     */
    public void setExtendS3(String extendS3) {
        this.extendS3 = extendS3;
    }

    /**
     * @return extend_s4
     */
    public String getExtendS4() {
        return extendS4;
    }

    /**
     * @param extendS4
     */
    public void setExtendS4(String extendS4) {
        this.extendS4 = extendS4;
    }

    /**
     * @return extend_s5
     */
    public String getExtendS5() {
        return extendS5;
    }

    /**
     * @param extendS5
     */
    public void setExtendS5(String extendS5) {
        this.extendS5 = extendS5;
    }

    /**
     * @return extend_s6
     */
    public String getExtendS6() {
        return extendS6;
    }

    /**
     * @param extendS6
     */
    public void setExtendS6(String extendS6) {
        this.extendS6 = extendS6;
    }

    /**
     * @return extend_s7
     */
    public String getExtendS7() {
        return extendS7;
    }

    /**
     * @param extendS7
     */
    public void setExtendS7(String extendS7) {
        this.extendS7 = extendS7;
    }

    /**
     * @return extend_s8
     */
    public String getExtendS8() {
        return extendS8;
    }

    /**
     * @param extendS8
     */
    public void setExtendS8(String extendS8) {
        this.extendS8 = extendS8;
    }

    /**
     * @return extend_i1
     */
    public BigDecimal getExtendI1() {
        return extendI1;
    }

    /**
     * @param extendI1
     */
    public void setExtendI1(BigDecimal extendI1) {
        this.extendI1 = extendI1;
    }

    /**
     * @return extend_i2
     */
    public BigDecimal getExtendI2() {
        return extendI2;
    }

    /**
     * @param extendI2
     */
    public void setExtendI2(BigDecimal extendI2) {
        this.extendI2 = extendI2;
    }

    /**
     * @return extend_i3
     */
    public BigDecimal getExtendI3() {
        return extendI3;
    }

    /**
     * @param extendI3
     */
    public void setExtendI3(BigDecimal extendI3) {
        this.extendI3 = extendI3;
    }

    /**
     * @return extend_i4
     */
    public BigDecimal getExtendI4() {
        return extendI4;
    }

    /**
     * @param extendI4
     */
    public void setExtendI4(BigDecimal extendI4) {
        this.extendI4 = extendI4;
    }

    /**
     * @return extend_f1
     */
    public BigDecimal getExtendF1() {
        return extendF1;
    }

    /**
     * @param extendF1
     */
    public void setExtendF1(BigDecimal extendF1) {
        this.extendF1 = extendF1;
    }

    /**
     * @return extend_f2
     */
    public BigDecimal getExtendF2() {
        return extendF2;
    }

    /**
     * @param extendF2
     */
    public void setExtendF2(BigDecimal extendF2) {
        this.extendF2 = extendF2;
    }

    /**
     * @return extend_f3
     */
    public BigDecimal getExtendF3() {
        return extendF3;
    }

    /**
     * @param extendF3
     */
    public void setExtendF3(BigDecimal extendF3) {
        this.extendF3 = extendF3;
    }

    /**
     * @return extend_f4
     */
    public BigDecimal getExtendF4() {
        return extendF4;
    }

    /**
     * @param extendF4
     */
    public void setExtendF4(BigDecimal extendF4) {
        this.extendF4 = extendF4;
    }

    /**
     * @return extend_d1
     */
    public Date getExtendD1() {
        return extendD1;
    }

    /**
     * @param extendD1
     */
    public void setExtendD1(Date extendD1) {
        this.extendD1 = extendD1;
    }

    /**
     * @return extend_d2
     */
    public Date getExtendD2() {
        return extendD2;
    }

    /**
     * @param extendD2
     */
    public void setExtendD2(Date extendD2) {
        this.extendD2 = extendD2;
    }

    /**
     * @return extend_d3
     */
    public Date getExtendD3() {
        return extendD3;
    }

    /**
     * @param extendD3
     */
    public void setExtendD3(Date extendD3) {
        this.extendD3 = extendD3;
    }

    /**
     * @return extend_d4
     */
    public Date getExtendD4() {
        return extendD4;
    }

    /**
     * @param extendD4
     */
    public void setExtendD4(Date extendD4) {
        this.extendD4 = extendD4;
    }
}