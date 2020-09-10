package ru.gibdd.ic.admloader.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Admpractice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String identificator;
    private String eventAdmPractice;
    private String regNumber;
    private String regionMaterial;
    private String materialNum;
    private String declarer;
    private String rulingUnit;
    private String protocolNum;
    private String region;
    private String narushPlace;
    private String department;
    private String inspector;
    private String koAp;
    private String subject;
    private String offenderCategory;
    private String offender;
    private Date birthday;
    private String address;
    private String inn;
    private String ogrn;
    private String grz;
    private String tsModel;
    private String vin;
    private String color;
    private String owner;
    private String decisionNum;
    private String decisionWhoMade;
    private String decisionRegion;
    private String decisionDepartment;
    private String judicialSector;
    private String panishmentType;
    private BigDecimal penaltySize;
    private Integer penaltyPeriod;
    private Integer arrestPeriod;
    private Integer disqualificationPeriod;
    private Integer compulsoryWorkPeriod;
    private Integer payment;
    private Integer residue;
    private String regionFssp;
    private Date departureDateFssp;
    private String departmentFssp;
    private Date dateLastCardView;
    private Date dateNarush;
    private Date dateSearchCheck;
    private String result;
    private Date dateSearchCheckTs;
    private String resultCheckTs;
    private String violation;
    private String marka;
    private String wuLost;
    private String performanceStatus;
    private String directionMaterials;
    private String receiptMaterials;
    private String postUserDepartment;
    private Date effectiveDate;
    private String citizenship;
    private String ownerCategory;
    private String tinting;
    private String tsCategory;
    private Date primaryMaterialDate;
    private String placeWork;
    private String additionalInformation;
    private String resultCheckGrz;
    private String resultCheckWu;
    private String resultCheckSts;
    private String phone;
    private String numberWu;
    private Date dataWu;
    private String kindIntoxication;
    private String typeMaterial;
    private String factualInformation;
    private String gpsLat;
    private String gpsLong;
    private String basisTerminationProduction;
    private String reasonTerminationProduction;
    private String regionWithdrawalWu;
    private String departmentWithdrawalWu;
    private String accidentParticipant;
    private Date beginnngTerm;
    private String postponement;
    private String documentNum;
    private String mailId;
    private String internationalRoadTransport;
    private Date materialDate;
    private Date recordCreationDate;
    private Date decisionDate;
    private Date reviewDate;
    private String regionViolation;
    private String typeAccounting;
    private String unknown1;
    private Date dateDispatch;
    private Date periodReview;
    private String unknown;
    private String caseNum;
    private Date loadData;

    @Basic
    @Column
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Identificator")
    public String getIdentificator() {
        return identificator;
    }

    public void setIdentificator(String identificator) {
        this.identificator = identificator;
    }

    @Basic
    @Column(name = "EventAdmPractice")
    public String getEventAdmPractice() {
        return eventAdmPractice;
    }

    public void setEventAdmPractice(String eventAdmPractice) {
        this.eventAdmPractice = eventAdmPractice;
    }

    @Basic
    @Column(name = "RegNumber")
    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Basic
    @Column(name = "RegionMaterial")
    public String getRegionMaterial() {
        return regionMaterial;
    }

    public void setRegionMaterial(String regionMaterial) {
        this.regionMaterial = regionMaterial;
    }

    @Basic
    @Column(name = "MaterialNum")
    public String getMaterialNum() {
        return materialNum;
    }

    public void setMaterialNum(String materialNum) {
        this.materialNum = materialNum;
    }

    @Basic
    @Column(name = "Declarer")
    public String getDeclarer() {
        return declarer;
    }

    public void setDeclarer(String declarer) {
        this.declarer = declarer;
    }

    @Basic
    @Column(name = "RulingUnit")
    public String getRulingUnit() {
        return rulingUnit;
    }

    public void setRulingUnit(String rulingUnit) {
        this.rulingUnit = rulingUnit;
    }

    @Basic
    @Column(name = "ProtocolNum")
    public String getProtocolNum() {
        return protocolNum;
    }

    public void setProtocolNum(String protocolNum) {
        this.protocolNum = protocolNum;
    }

    @Basic
    @Column(name = "Region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "NarushPlace")
    public String getNarushPlace() {
        return narushPlace;
    }

    public void setNarushPlace(String narushPlace) {
        this.narushPlace = narushPlace;
    }

    @Basic
    @Column(name = "Department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "Inspector")
    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    @Basic
    @Column(name = "KoAP")
    public String getKoAp() {
        return koAp;
    }

    public void setKoAp(String koAp) {
        this.koAp = koAp;
    }

    @Basic
    @Column(name = "Subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "OffenderCategory")
    public String getOffenderCategory() {
        return offenderCategory;
    }

    public void setOffenderCategory(String offenderCategory) {
        this.offenderCategory = offenderCategory;
    }

    @Basic
    @Column(name = "Offender")
    public String getOffender() {
        return offender;
    }

    public void setOffender(String offender) {
        this.offender = offender;
    }

    @Basic
    @Column(name = "Birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "INN")
    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    @Basic
    @Column(name = "OGRN")
    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    @Basic
    @Column(name = "GRZ")
    public String getGrz() {
        return grz;
    }

    public void setGrz(String grz) {
        this.grz = grz;
    }

    @Basic
    @Column(name = "TSModel")
    public String getTsModel() {
        return tsModel;
    }

    public void setTsModel(String tsModel) {
        this.tsModel = tsModel;
    }

    @Basic
    @Column(name = "VIN")
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Basic
    @Column(name = "Color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "Owner")
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Basic
    @Column(name = "DecisionNum")
    public String getDecisionNum() {
        return decisionNum;
    }

    public void setDecisionNum(String decisionNum) {
        this.decisionNum = decisionNum;
    }

    @Basic
    @Column(name = "DecisionWhoMade")
    public String getDecisionWhoMade() {
        return decisionWhoMade;
    }

    public void setDecisionWhoMade(String decisionWhoMade) {
        this.decisionWhoMade = decisionWhoMade;
    }

    @Basic
    @Column(name = "DecisionRegion")
    public String getDecisionRegion() {
        return decisionRegion;
    }

    public void setDecisionRegion(String decisionRegion) {
        this.decisionRegion = decisionRegion;
    }

    @Basic
    @Column(name = "DecisionDepartment")
    public String getDecisionDepartment() {
        return decisionDepartment;
    }

    public void setDecisionDepartment(String decisionDepartment) {
        this.decisionDepartment = decisionDepartment;
    }

    @Basic
    @Column(name = "JudicialSector")
    public String getJudicialSector() {
        return judicialSector;
    }

    public void setJudicialSector(String judicialSector) {
        this.judicialSector = judicialSector;
    }

    @Basic
    @Column(name = "PanishmentType")
    public String getPanishmentType() {
        return panishmentType;
    }

    public void setPanishmentType(String panishmentType) {
        this.panishmentType = panishmentType;
    }

    @Basic
    @Column(name = "PenaltySize")
    public BigDecimal getPenaltySize() {
        return penaltySize;
    }

    public void setPenaltySize(BigDecimal penaltySize) {
        this.penaltySize = penaltySize;
    }

    @Basic
    @Column(name = "PenaltyPeriod")
    public Integer getPenaltyPeriod() {
        return penaltyPeriod;
    }

    public void setPenaltyPeriod(Integer penaltyPeriod) {
        this.penaltyPeriod = penaltyPeriod;
    }

    @Basic
    @Column(name = "ArrestPeriod")
    public Integer getArrestPeriod() {
        return arrestPeriod;
    }

    public void setArrestPeriod(Integer arrestPeriod) {
        this.arrestPeriod = arrestPeriod;
    }

    @Basic
    @Column(name = "DisqualificationPeriod")
    public Integer getDisqualificationPeriod() {
        return disqualificationPeriod;
    }

    public void setDisqualificationPeriod(Integer disqualificationPeriod) {
        this.disqualificationPeriod = disqualificationPeriod;
    }

    @Basic
    @Column(name = "CompulsoryWorkPeriod")
    public Integer getCompulsoryWorkPeriod() {
        return compulsoryWorkPeriod;
    }

    public void setCompulsoryWorkPeriod(Integer compulsoryWorkPeriod) {
        this.compulsoryWorkPeriod = compulsoryWorkPeriod;
    }

    @Basic
    @Column(name = "Payment")
    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    @Basic
    @Column(name = "Residue")
    public Integer getResidue() {
        return residue;
    }

    public void setResidue(Integer residue) {
        this.residue = residue;
    }

    @Basic
    @Column(name = "RegionFSSP")
    public String getRegionFssp() {
        return regionFssp;
    }

    public void setRegionFssp(String regionFssp) {
        this.regionFssp = regionFssp;
    }

    @Basic
    @Column(name = "DepartureDateFSSP")
    public Date getDepartureDateFssp() {
        return departureDateFssp;
    }

    public void setDepartureDateFssp(Date departureDateFssp) {
        this.departureDateFssp = departureDateFssp;
    }

    @Basic
    @Column(name = "DepartmentFSSP")
    public String getDepartmentFssp() {
        return departmentFssp;
    }

    public void setDepartmentFssp(String departmentFssp) {
        this.departmentFssp = departmentFssp;
    }

    @Basic
    @Column(name = "DateLastCardView")
    public Date getDateLastCardView() {
        return dateLastCardView;
    }

    public void setDateLastCardView(Date dateLastCardView) {
        this.dateLastCardView = dateLastCardView;
    }

    @Basic
    @Column(name = "DateNarush")
    public Date getDateNarush() {
        return dateNarush;
    }

    public void setDateNarush(Date dateNarush) {
        this.dateNarush = dateNarush;
    }

    @Basic
    @Column(name = "DateSearchCheck")
    public Date getDateSearchCheck() {
        return dateSearchCheck;
    }

    public void setDateSearchCheck(Date dateSearchCheck) {
        this.dateSearchCheck = dateSearchCheck;
    }

    @Basic
    @Column(name = "Result")
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Basic
    @Column(name = "DateSearchCheckTS")
    public Date getDateSearchCheckTs() {
        return dateSearchCheckTs;
    }

    public void setDateSearchCheckTs(Date dateSearchCheckTs) {
        this.dateSearchCheckTs = dateSearchCheckTs;
    }

    @Basic
    @Column(name = "ResultCheckTS")
    public String getResultCheckTs() {
        return resultCheckTs;
    }

    public void setResultCheckTs(String resultCheckTs) {
        this.resultCheckTs = resultCheckTs;
    }

    @Basic
    @Column(name = "Violation")
    public String getViolation() {
        return violation;
    }

    public void setViolation(String violation) {
        this.violation = violation;
    }

    @Basic
    @Column(name = "Marka")
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Basic
    @Column(name = "WULost")
    public String getWuLost() {
        return wuLost;
    }

    public void setWuLost(String wuLost) {
        this.wuLost = wuLost;
    }

    @Basic
    @Column(name = "PerformanceStatus")
    public String getPerformanceStatus() {
        return performanceStatus;
    }

    public void setPerformanceStatus(String performanceStatus) {
        this.performanceStatus = performanceStatus;
    }

    @Basic
    @Column(name = "DirectionMaterials")
    public String getDirectionMaterials() {
        return directionMaterials;
    }

    public void setDirectionMaterials(String directionMaterials) {
        this.directionMaterials = directionMaterials;
    }

    @Basic
    @Column(name = "ReceiptMaterials")
    public String getReceiptMaterials() {
        return receiptMaterials;
    }

    public void setReceiptMaterials(String receiptMaterials) {
        this.receiptMaterials = receiptMaterials;
    }

    @Basic
    @Column(name = "PostUserDepartment")
    public String getPostUserDepartment() {
        return postUserDepartment;
    }

    public void setPostUserDepartment(String postUserDepartment) {
        this.postUserDepartment = postUserDepartment;
    }

    @Basic
    @Column(name = "EffectiveDate")
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @Basic
    @Column(name = "Citizenship")
    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    @Basic
    @Column(name = "OwnerCategory")
    public String getOwnerCategory() {
        return ownerCategory;
    }

    public void setOwnerCategory(String ownerCategory) {
        this.ownerCategory = ownerCategory;
    }

    @Basic
    @Column(name = "Tinting")
    public String getTinting() {
        return tinting;
    }

    public void setTinting(String tinting) {
        this.tinting = tinting;
    }

    @Basic
    @Column(name = "TSCategory")
    public String getTsCategory() {
        return tsCategory;
    }

    public void setTsCategory(String tsCategory) {
        this.tsCategory = tsCategory;
    }

    @Basic
    @Column(name = "PrimaryMaterialDate")
    public Date getPrimaryMaterialDate() {
        return primaryMaterialDate;
    }

    public void setPrimaryMaterialDate(Date primaryMaterialDate) {
        this.primaryMaterialDate = primaryMaterialDate;
    }

    @Basic
    @Column(name = "PlaceWork")
    public String getPlaceWork() {
        return placeWork;
    }

    public void setPlaceWork(String placeWork) {
        this.placeWork = placeWork;
    }

    @Basic
    @Column(name = "AdditionalInformation")
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    @Basic
    @Column(name = "ResultCheckGRZ")
    public String getResultCheckGrz() {
        return resultCheckGrz;
    }

    public void setResultCheckGrz(String resultCheckGrz) {
        this.resultCheckGrz = resultCheckGrz;
    }

    @Basic
    @Column(name = "ResultCheckWU")
    public String getResultCheckWu() {
        return resultCheckWu;
    }

    public void setResultCheckWu(String resultCheckWu) {
        this.resultCheckWu = resultCheckWu;
    }

    @Basic
    @Column(name = "ResultCheckSTS")
    public String getResultCheckSts() {
        return resultCheckSts;
    }

    public void setResultCheckSts(String resultCheckSts) {
        this.resultCheckSts = resultCheckSts;
    }

    @Basic
    @Column(name = "Phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "NumberWU")
    public String getNumberWu() {
        return numberWu;
    }

    public void setNumberWu(String numberWu) {
        this.numberWu = numberWu;
    }

    @Basic
    @Column(name = "DataWU")
    public Date getDataWu() {
        return dataWu;
    }

    public void setDataWu(Date dataWu) {
        this.dataWu = dataWu;
    }

    @Basic
    @Column(name = "KindIntoxication")
    public String getKindIntoxication() {
        return kindIntoxication;
    }

    public void setKindIntoxication(String kindIntoxication) {
        this.kindIntoxication = kindIntoxication;
    }

    @Basic
    @Column(name = "TypeMaterial")
    public String getTypeMaterial() {
        return typeMaterial;
    }

    public void setTypeMaterial(String typeMaterial) {
        this.typeMaterial = typeMaterial;
    }

    @Basic
    @Column(name = "FactualInformation")
    public String getFactualInformation() {
        return factualInformation;
    }

    public void setFactualInformation(String factualInformation) {
        this.factualInformation = factualInformation;
    }

    @Basic
    @Column(name = "GPSLat")
    public String getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(String gpsLat) {
        this.gpsLat = gpsLat;
    }

    @Basic
    @Column(name = "GPSLong")
    public String getGpsLong() {
        return gpsLong;
    }

    public void setGpsLong(String gpsLong) {
        this.gpsLong = gpsLong;
    }

    @Basic
    @Column(name = "BasisTerminationProduction")
    public String getBasisTerminationProduction() {
        return basisTerminationProduction;
    }

    public void setBasisTerminationProduction(String basisTerminationProduction) {
        this.basisTerminationProduction = basisTerminationProduction;
    }

    @Basic
    @Column(name = "ReasonTerminationProduction")
    public String getReasonTerminationProduction() {
        return reasonTerminationProduction;
    }

    public void setReasonTerminationProduction(String reasonTerminationProduction) {
        this.reasonTerminationProduction = reasonTerminationProduction;
    }

    @Basic
    @Column(name = "RegionWithdrawalWU")
    public String getRegionWithdrawalWu() {
        return regionWithdrawalWu;
    }

    public void setRegionWithdrawalWu(String regionWithdrawalWu) {
        this.regionWithdrawalWu = regionWithdrawalWu;
    }

    @Basic
    @Column(name = "DepartmentWithdrawalWU")
    public String getDepartmentWithdrawalWu() {
        return departmentWithdrawalWu;
    }

    public void setDepartmentWithdrawalWu(String departmentWithdrawalWu) {
        this.departmentWithdrawalWu = departmentWithdrawalWu;
    }

    @Basic
    @Column(name = "AccidentParticipant")
    public String getAccidentParticipant() {
        return accidentParticipant;
    }

    public void setAccidentParticipant(String accidentParticipant) {
        this.accidentParticipant = accidentParticipant;
    }

    @Basic
    @Column(name = "BeginnngTerm")
    public Date getBeginnngTerm() {
        return beginnngTerm;
    }

    public void setBeginnngTerm(Date beginnngTerm) {
        this.beginnngTerm = beginnngTerm;
    }

    @Basic
    @Column(name = "Postponement")
    public String getPostponement() {
        return postponement;
    }

    public void setPostponement(String postponement) {
        this.postponement = postponement;
    }

    @Basic
    @Column(name = "DocumentNum")
    public String getDocumentNum() {
        return documentNum;
    }

    public void setDocumentNum(String documentNum) {
        this.documentNum = documentNum;
    }

    @Basic
    @Column(name = "MailID")
    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    @Basic
    @Column(name = "InternationalRoadTransport")
    public String getInternationalRoadTransport() {
        return internationalRoadTransport;
    }

    public void setInternationalRoadTransport(String internationalRoadTransport) {
        this.internationalRoadTransport = internationalRoadTransport;
    }

    @Basic
    @Column(name = "MaterialDate")
    public Date getMaterialDate() {
        return materialDate;
    }

    public void setMaterialDate(Date materialDate) {
        this.materialDate = materialDate;
    }

    @Basic
    @Column(name = "RecordCreationDate")
    public Date getRecordCreationDate() {
        return recordCreationDate;
    }

    public void setRecordCreationDate(Date recordCreationDate) {
        this.recordCreationDate = recordCreationDate;
    }

    @Basic
    @Column(name = "DecisionDate")
    public Date getDecisionDate() {
        return decisionDate;
    }

    public void setDecisionDate(Date decisionDate) {
        this.decisionDate = decisionDate;
    }

    @Basic
    @Column(name = "ReviewDate")
    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    @Basic
    @Column(name = "RegionViolation")
    public String getRegionViolation() {
        return regionViolation;
    }

    public void setRegionViolation(String regionViolation) {
        this.regionViolation = regionViolation;
    }

    @Basic
    @Column(name = "TypeAccounting")
    public String getTypeAccounting() {
        return typeAccounting;
    }

    public void setTypeAccounting(String typeAccounting) {
        this.typeAccounting = typeAccounting;
    }

    @Basic
    @Column(name = "Unknown1")
    public String getUnknown1() {
        return unknown1;
    }

    public void setUnknown1(String unknown1) {
        this.unknown1 = unknown1;
    }

    @Basic
    @Column(name = "DateDispatch")
    public Date getDateDispatch() {
        return dateDispatch;
    }

    public void setDateDispatch(Date dateDispatch) {
        this.dateDispatch = dateDispatch;
    }

    @Basic
    @Column(name = "PeriodReview")
    public Date getPeriodReview() {
        return periodReview;
    }

    public void setPeriodReview(Date periodReview) {
        this.periodReview = periodReview;
    }

    @Basic
    @Column(name = "Unknown")
    public String getUnknown() {
        return unknown;
    }

    public void setUnknown(String unknown) {
        this.unknown = unknown;
    }

    @Basic
    @Column(name = "CaseNum")
    public String getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(String caseNum) {
        this.caseNum = caseNum;
    }

    @Basic
    @Column(name = "loadData")
    public Date getLoadData() {
        return loadData;
    }

    public void setLoadData(Date loadData) {
        this.loadData = loadData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admpractice that = (Admpractice) o;
        return Objects.equals(identificator, that.identificator) &&
                Objects.equals(eventAdmPractice, that.eventAdmPractice) &&
                Objects.equals(regNumber, that.regNumber) &&
                Objects.equals(regionMaterial, that.regionMaterial) &&
                Objects.equals(materialNum, that.materialNum) &&
                Objects.equals(declarer, that.declarer) &&
                Objects.equals(rulingUnit, that.rulingUnit) &&
                Objects.equals(protocolNum, that.protocolNum) &&
                Objects.equals(region, that.region) &&
                Objects.equals(narushPlace, that.narushPlace) &&
                Objects.equals(department, that.department) &&
                Objects.equals(inspector, that.inspector) &&
                Objects.equals(koAp, that.koAp) &&
                Objects.equals(subject, that.subject) &&
                Objects.equals(offenderCategory, that.offenderCategory) &&
                Objects.equals(offender, that.offender) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(address, that.address) &&
                Objects.equals(inn, that.inn) &&
                Objects.equals(ogrn, that.ogrn) &&
                Objects.equals(grz, that.grz) &&
                Objects.equals(tsModel, that.tsModel) &&
                Objects.equals(vin, that.vin) &&
                Objects.equals(color, that.color) &&
                Objects.equals(owner, that.owner) &&
                Objects.equals(decisionNum, that.decisionNum) &&
                Objects.equals(decisionWhoMade, that.decisionWhoMade) &&
                Objects.equals(decisionRegion, that.decisionRegion) &&
                Objects.equals(decisionDepartment, that.decisionDepartment) &&
                Objects.equals(judicialSector, that.judicialSector) &&
                Objects.equals(panishmentType, that.panishmentType) &&
                Objects.equals(penaltySize, that.penaltySize) &&
                Objects.equals(penaltyPeriod, that.penaltyPeriod) &&
                Objects.equals(arrestPeriod, that.arrestPeriod) &&
                Objects.equals(disqualificationPeriod, that.disqualificationPeriod) &&
                Objects.equals(compulsoryWorkPeriod, that.compulsoryWorkPeriod) &&
                Objects.equals(payment, that.payment) &&
                Objects.equals(residue, that.residue) &&
                Objects.equals(regionFssp, that.regionFssp) &&
                Objects.equals(departureDateFssp, that.departureDateFssp) &&
                Objects.equals(departmentFssp, that.departmentFssp) &&
                Objects.equals(dateLastCardView, that.dateLastCardView) &&
                Objects.equals(dateNarush, that.dateNarush) &&
                Objects.equals(dateSearchCheck, that.dateSearchCheck) &&
                Objects.equals(result, that.result) &&
                Objects.equals(dateSearchCheckTs, that.dateSearchCheckTs) &&
                Objects.equals(resultCheckTs, that.resultCheckTs) &&
                Objects.equals(violation, that.violation) &&
                Objects.equals(marka, that.marka) &&
                Objects.equals(wuLost, that.wuLost) &&
                Objects.equals(performanceStatus, that.performanceStatus) &&
                Objects.equals(directionMaterials, that.directionMaterials) &&
                Objects.equals(receiptMaterials, that.receiptMaterials) &&
                Objects.equals(postUserDepartment, that.postUserDepartment) &&
                Objects.equals(effectiveDate, that.effectiveDate) &&
                Objects.equals(citizenship, that.citizenship) &&
                Objects.equals(ownerCategory, that.ownerCategory) &&
                Objects.equals(tinting, that.tinting) &&
                Objects.equals(tsCategory, that.tsCategory) &&
                Objects.equals(primaryMaterialDate, that.primaryMaterialDate) &&
                Objects.equals(placeWork, that.placeWork) &&
                Objects.equals(additionalInformation, that.additionalInformation) &&
                Objects.equals(resultCheckGrz, that.resultCheckGrz) &&
                Objects.equals(resultCheckWu, that.resultCheckWu) &&
                Objects.equals(resultCheckSts, that.resultCheckSts) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(numberWu, that.numberWu) &&
                Objects.equals(dataWu, that.dataWu) &&
                Objects.equals(kindIntoxication, that.kindIntoxication) &&
                Objects.equals(typeMaterial, that.typeMaterial) &&
                Objects.equals(factualInformation, that.factualInformation) &&
                Objects.equals(gpsLat, that.gpsLat) &&
                Objects.equals(gpsLong, that.gpsLong) &&
                Objects.equals(basisTerminationProduction, that.basisTerminationProduction) &&
                Objects.equals(reasonTerminationProduction, that.reasonTerminationProduction) &&
                Objects.equals(regionWithdrawalWu, that.regionWithdrawalWu) &&
                Objects.equals(departmentWithdrawalWu, that.departmentWithdrawalWu) &&
                Objects.equals(accidentParticipant, that.accidentParticipant) &&
                Objects.equals(beginnngTerm, that.beginnngTerm) &&
                Objects.equals(postponement, that.postponement) &&
                Objects.equals(documentNum, that.documentNum) &&
                Objects.equals(mailId, that.mailId) &&
                Objects.equals(internationalRoadTransport, that.internationalRoadTransport) &&
                Objects.equals(materialDate, that.materialDate) &&
                Objects.equals(recordCreationDate, that.recordCreationDate) &&
                Objects.equals(decisionDate, that.decisionDate) &&
                Objects.equals(reviewDate, that.reviewDate) &&
                Objects.equals(regionViolation, that.regionViolation) &&
                Objects.equals(typeAccounting, that.typeAccounting) &&
                Objects.equals(unknown1, that.unknown1) &&
                Objects.equals(dateDispatch, that.dateDispatch) &&
                Objects.equals(periodReview, that.periodReview) &&
                Objects.equals(unknown, that.unknown) &&
                Objects.equals(caseNum, that.caseNum) &&
                Objects.equals(loadData, that.loadData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificator, eventAdmPractice, regNumber, regionMaterial, materialNum, declarer, rulingUnit, protocolNum, region, narushPlace, department, inspector, koAp, subject, offenderCategory, offender, birthday, address, inn, ogrn, grz, tsModel, vin, color, owner, decisionNum, decisionWhoMade, decisionRegion, decisionDepartment, judicialSector, panishmentType, penaltySize, penaltyPeriod, arrestPeriod, disqualificationPeriod, compulsoryWorkPeriod, payment, residue, regionFssp, departureDateFssp, departmentFssp, dateLastCardView, dateNarush, dateSearchCheck, result, dateSearchCheckTs, resultCheckTs, violation, marka, wuLost, performanceStatus, directionMaterials, receiptMaterials, postUserDepartment, effectiveDate, citizenship, ownerCategory, tinting, tsCategory, primaryMaterialDate, placeWork, additionalInformation, resultCheckGrz, resultCheckWu, resultCheckSts, phone, numberWu, dataWu, kindIntoxication, typeMaterial, factualInformation, gpsLat, gpsLong, basisTerminationProduction, reasonTerminationProduction, regionWithdrawalWu, departmentWithdrawalWu, accidentParticipant, beginnngTerm, postponement, documentNum, mailId, internationalRoadTransport, materialDate, recordCreationDate, decisionDate, reviewDate, regionViolation, typeAccounting, unknown1, dateDispatch, periodReview, unknown, caseNum, loadData);
    }
}
