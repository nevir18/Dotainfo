package com.example.android.dotainfo.com.example.android.dotainfo2;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DotaDetailsGSON {

    @SerializedName("match_id")
    @Expose
    private Long matchId1;
    @SerializedName("barracks_status_dire")
    @Expose
    private Integer barracksStatusDire;
    @SerializedName("barracks_status_radiant")
    @Expose
    private Integer barracksStatusRadiant;
    @SerializedName("chat")
    @Expose
    private List<Chat> chat = null;
    @SerializedName("cluster")
    @Expose
    private Integer cluster;
    @SerializedName("cosmetics")
    @Expose
    private Cosmetics cosmetics;
    @SerializedName("dire_score")
    @Expose
    private Integer direScore;
    @SerializedName("draft_timings")
    @Expose
    private List<DraftTiming> draftTimings = null;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("engine")
    @Expose
    private Integer engine;
    @SerializedName("first_blood_time")
    @Expose
    private Integer firstBloodTime;
    @SerializedName("game_mode")
    @Expose
    private Integer gameMode;
    @SerializedName("human_players")
    @Expose
    private Integer humanPlayers;
    @SerializedName("leagueid")
    @Expose
    private Integer leagueid;
    @SerializedName("lobby_type")
    @Expose
    private Integer lobbyType;
    //    @SerializedName("match_seq_num")
//    @Expose
//    private Integer matchSeqNum;
    @SerializedName("negative_votes")
    @Expose
    private Integer negativeVotes;
    //    @SerializedName("objectives")
//    @Expose
//    private Objectives objectives;
//    @SerializedName("picks_bans")
//    @Expose
//    private PicksBans picksBans;
    @SerializedName("positive_votes")
    @Expose
    private Integer positiveVotes;
    //    @SerializedName("radiant_gold_adv")
//    @Expose
//    private RadiantGoldAdv radiantGoldAdv;
    @SerializedName("radiant_score")
    @Expose
    private Integer radiantScore;
    @SerializedName("radiant_win")
    @Expose
    private Boolean radiantWin;
    //    @SerializedName("radiant_xp_adv")
//    @Expose
//    private RadiantXpAdv radiantXpAdv;
    @SerializedName("start_time")
    @Expose
    private Integer startTime;
    //    @SerializedName("teamfights")
//    @Expose
//    private Teamfights teamfights;
    @SerializedName("tower_status_dire")
    @Expose
    private Integer towerStatusDire;
    @SerializedName("tower_status_radiant")
    @Expose
    private Integer towerStatusRadiant;
    @SerializedName("version")
    @Expose
    private Integer version;
    @SerializedName("replay_salt")
    @Expose
    private Integer replaySalt;
    @SerializedName("series_id")
    @Expose
    private Integer seriesId;
    @SerializedName("series_type")
    @Expose
    private Integer seriesType;
    @SerializedName("radiant_team")
    @Expose
    private RadiantTeam radiantTeam;
    @SerializedName("dire_team")
    @Expose
    private DireTeam direTeam;
    @SerializedName("league")
    @Expose
    private League league;
    @SerializedName("skill")
    @Expose
    private Integer skill;
    @SerializedName("players")
    @Expose
    private List<Player> players = new ArrayList<>();
    @SerializedName("patch")
    @Expose
    private Integer patch;
    @SerializedName("region")
    @Expose
    private Integer region;
    @SerializedName("all_word_counts")
    @Expose
    private AllWordCounts allWordCounts;
    @SerializedName("my_word_counts")
    @Expose
    private MyWordCounts myWordCounts;
    @SerializedName("throw")
    @Expose
    private Integer _throw;
    @SerializedName("loss")
    @Expose
    private Integer loss;
    @SerializedName("replay_url")
    @Expose
    private String replayUrl;

    public Long getMatchId1() {
        return matchId1;
    }

    public void setMatchId1(Long matchId1) {
        this.matchId1 = matchId1;
    }

    public Integer getBarracksStatusDire() {
        return barracksStatusDire;
    }

    public void setBarracksStatusDire(Integer barracksStatusDire) {
        this.barracksStatusDire = barracksStatusDire;
    }

    public Integer getBarracksStatusRadiant() {
        return barracksStatusRadiant;
    }

    public void setBarracksStatusRadiant(Integer barracksStatusRadiant) {
        this.barracksStatusRadiant = barracksStatusRadiant;
    }

    public List<Chat> getChat() {
        return chat;
    }

    public void setChat(List<Chat> chat) {
        this.chat = chat;
    }

    public Integer getCluster() {
        return cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public Cosmetics getCosmetics() {
        return cosmetics;
    }

    public void setCosmetics(Cosmetics cosmetics) {
        this.cosmetics = cosmetics;
    }

    public Integer getDireScore() {
        return direScore;
    }

    public void setDireScore(Integer direScore) {
        this.direScore = direScore;
    }

    public List<DraftTiming> getDraftTimings() {
        return draftTimings;
    }

    public void setDraftTimings(List<DraftTiming> draftTimings) {
        this.draftTimings = draftTimings;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getEngine() {
        return engine;
    }

    public void setEngine(Integer engine) {
        this.engine = engine;
    }

    public Integer getFirstBloodTime() {
        return firstBloodTime;
    }

    public void setFirstBloodTime(Integer firstBloodTime) {
        this.firstBloodTime = firstBloodTime;
    }

    public Integer getGameMode() {
        return gameMode;
    }

    public void setGameMode(Integer gameMode) {
        this.gameMode = gameMode;
    }

    public Integer getHumanPlayers() {
        return humanPlayers;
    }

    public void setHumanPlayers(Integer humanPlayers) {
        this.humanPlayers = humanPlayers;
    }

    public Integer getLeagueid() {
        return leagueid;
    }

    public void setLeagueid(Integer leagueid) {
        this.leagueid = leagueid;
    }

    public Integer getLobbyType() {
        return lobbyType;
    }

    public void setLobbyType(Integer lobbyType) {
        this.lobbyType = lobbyType;
    }

//    public Integer getMatchSeqNum() {
//        return matchSeqNum;
//    }
//
//    public void setMatchSeqNum(Integer matchSeqNum) {
//        this.matchSeqNum = matchSeqNum;
//    }

    public Integer getNegativeVotes() {
        return negativeVotes;
    }

    public void setNegativeVotes(Integer negativeVotes) {
        this.negativeVotes = negativeVotes;
    }

//    public Objectives getObjectives() {
//        return objectives;
//    }
//
//    public void setObjectives(Objectives objectives) {
//        this.objectives = objectives;
//    }
//
//    public PicksBans getPicksBans() {
//        return picksBans;
//    }
//
//    public void setPicksBans(PicksBans picksBans) {
//        this.picksBans = picksBans;
//    }

    public Integer getPositiveVotes() {
        return positiveVotes;
    }

    public void setPositiveVotes(Integer positiveVotes) {
        this.positiveVotes = positiveVotes;
    }

//    public RadiantGoldAdv getRadiantGoldAdv() {
//        return radiantGoldAdv;
//    }
//
//    public void setRadiantGoldAdv(RadiantGoldAdv radiantGoldAdv) {
//        this.radiantGoldAdv = radiantGoldAdv;
//    }

    public Integer getRadiantScore() {
        return radiantScore;
    }

    public void setRadiantScore(Integer radiantScore) {
        this.radiantScore = radiantScore;
    }

    public Boolean getRadiantWin() { return radiantWin; }

    public void setRadiantWin(Boolean radiantWin) {
        this.radiantWin = radiantWin;
    }

//    public RadiantXpAdv getRadiantXpAdv() {
//        return radiantXpAdv;
//    }
//
//    public void setRadiantXpAdv(RadiantXpAdv radiantXpAdv) {
//        this.radiantXpAdv = radiantXpAdv;
//    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

//    public Teamfights getTeamfights() {
//        return teamfights;
//    }
//
//    public void setTeamfights(Teamfights teamfights) {
//        this.teamfights = teamfights;
//    }

    public Integer getTowerStatusDire() {
        return towerStatusDire;
    }

    public void setTowerStatusDire(Integer towerStatusDire) {
        this.towerStatusDire = towerStatusDire;
    }

    public Integer getTowerStatusRadiant() {
        return towerStatusRadiant;
    }

    public void setTowerStatusRadiant(Integer towerStatusRadiant) {
        this.towerStatusRadiant = towerStatusRadiant;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getReplaySalt() {
        return replaySalt;
    }

    public void setReplaySalt(Integer replaySalt) {
        this.replaySalt = replaySalt;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public Integer getSeriesType() {
        return seriesType;
    }

    public void setSeriesType(Integer seriesType) {
        this.seriesType = seriesType;
    }

    public RadiantTeam getRadiantTeam() {
        return radiantTeam;
    }

    public void setRadiantTeam(RadiantTeam radiantTeam) {
        this.radiantTeam = radiantTeam;
    }

    public DireTeam getDireTeam() {
        return direTeam;
    }

    public void setDireTeam(DireTeam direTeam) {
        this.direTeam = direTeam;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Integer getSkill() {
        return skill;
    }

    public void setSkill(Integer skill) {
        this.skill = skill;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Integer getPatch() {
        return patch;
    }

    public void setPatch(Integer patch) {
        this.patch = patch;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public AllWordCounts getAllWordCounts() {
        return allWordCounts;
    }

    public void setAllWordCounts(AllWordCounts allWordCounts) {
        this.allWordCounts = allWordCounts;
    }

    public MyWordCounts getMyWordCounts() {
        return myWordCounts;
    }

    public void setMyWordCounts(MyWordCounts myWordCounts) {
        this.myWordCounts = myWordCounts;
    }

    public Integer getThrow() {
        return _throw;
    }

    public void setThrow(Integer _throw) {
        this._throw = _throw;
    }

    public Integer getLoss() {
        return loss;
    }

    public void setLoss(Integer loss) {
        this.loss = loss;
    }

    public String getReplayUrl() {
        return replayUrl;
    }

    public void setReplayUrl(String replayUrl) {
        this.replayUrl = replayUrl;
    }

}
