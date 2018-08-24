
package com.example.android.dotainfo.com.example.android.dotainfo2;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Player {

    @SerializedName("match_id")
    @Expose
    private Long matchId;
    @SerializedName("player_slot")
    @Expose
    private Integer playerSlot;
//    @SerializedName("ability_upgrades_arr")
//    @Expose
//    private List<Object> abilityUpgradesArr = null;
    @SerializedName("ability_uses")
    @Expose
    private AbilityUses abilityUses;
    @SerializedName("ability_targets")
    @Expose
    private AbilityTargets abilityTargets;
    @SerializedName("damage_targets")
    @Expose
    private DamageTargets damageTargets;
    @SerializedName("account_id")
    @Expose
    private Integer accountId;
    @SerializedName("actions")
    @Expose
    private Actions actions;
    @SerializedName("additional_units")
    @Expose
    private AdditionalUnits additionalUnits;
    @SerializedName("assists")
    @Expose
    private Integer assists;
    @SerializedName("backpack_0")
    @Expose
    private Integer backpack0;
    @SerializedName("backpack_1")
    @Expose
    private Integer backpack1;
    @SerializedName("backpack_2")
    @Expose
    private Integer backpack2;
//    @SerializedName("buyback_log")
//    @Expose
//    private List<Object> buybackLog = null;
    @SerializedName("camps_stacked")
    @Expose
    private Integer campsStacked;
    @SerializedName("creeps_stacked")
    @Expose
    private Integer creepsStacked;
    @SerializedName("damage")
    @Expose
    private Damage damage;
    @SerializedName("damage_inflictor")
    @Expose
    private DamageInflictor damageInflictor;
    @SerializedName("damage_inflictor_received")
    @Expose
    private DamageInflictorReceived damageInflictorReceived;
    @SerializedName("damage_taken")
    @Expose
    private DamageTaken damageTaken;
    @SerializedName("deaths")
    @Expose
    private Integer deaths;
    @SerializedName("denies")
    @Expose
    private Integer denies;
//    @SerializedName("dn_t")
//    @Expose
//    private List<Object> dnT = null;
    @SerializedName("gold")
    @Expose
    private Integer gold;
    @SerializedName("gold_per_min")
    @Expose
    private Integer goldPerMin;
    @SerializedName("gold_reasons")
    @Expose
    private GoldReasons goldReasons;
    @SerializedName("gold_spent")
    @Expose
    private Integer goldSpent;
//    @SerializedName("gold_t")
//    @Expose
//    private List<Object> goldT = null;
    @SerializedName("hero_damage")
    @Expose
    private Integer heroDamage;
    @SerializedName("hero_healing")
    @Expose
    private Integer heroHealing;
    @SerializedName("hero_hits")
    @Expose
    private HeroHits heroHits;
    @SerializedName("hero_id")
    @Expose
    private Integer heroId;
    @SerializedName("item_0")
    @Expose
    private Integer item0;
    @SerializedName("item_1")
    @Expose
    private Integer item1;
    @SerializedName("item_2")
    @Expose
    private Integer item2;
    @SerializedName("item_3")
    @Expose
    private Integer item3;
    @SerializedName("item_4")
    @Expose
    private Integer item4;
    @SerializedName("item_5")
    @Expose
    private Integer item5;
    @SerializedName("item_uses")
    @Expose
    private ItemUses itemUses;
    @SerializedName("kill_streaks")
    @Expose
    private KillStreaks killStreaks;
    @SerializedName("killed")
    @Expose
    private Killed killed;
    @SerializedName("killed_by")
    @Expose
    private KilledBy killedBy;
    @SerializedName("kills")
    @Expose
    private Integer kills;
//    @SerializedName("kills_log")
//    @Expose
//    private List<Object> killsLog = null;
    @SerializedName("lane_pos")
    @Expose
    private LanePos lanePos;
    @SerializedName("last_hits")
    @Expose
    private Integer lastHits;
    @SerializedName("leaver_status")
    @Expose
    private Integer leaverStatus;
    @SerializedName("level")
    @Expose
    private Integer level;
//    @SerializedName("lh_t")
//    @Expose
//    private List<Object> lhT = null;
    @SerializedName("life_state")
    @Expose
    private LifeState lifeState;
    @SerializedName("max_hero_hit")
    @Expose
    private MaxHeroHit maxHeroHit;
    @SerializedName("multi_kills")
    @Expose
    private MultiKills multiKills;
    @SerializedName("obs")
    @Expose
    private Obs obs;
//    @SerializedName("obs_left_log")
//    @Expose
//    private List<Object> obsLeftLog = null;
//    @SerializedName("obs_log")
//    @Expose
//    private List<Object> obsLog = null;
    @SerializedName("obs_placed")
    @Expose
    private Integer obsPlaced;
    @SerializedName("party_id")
    @Expose
    private Integer partyId;
//    @SerializedName("permanent_buffs")
//    @Expose
//    private List<Object> permanentBuffs = null;
    @SerializedName("pings")
    @Expose
    private Integer pings;
    @SerializedName("purchase")
    @Expose
    private Purchase purchase;
//    @SerializedName("purchase_log")
//    @Expose
//    private List<Object> purchaseLog = null;
    @SerializedName("rune_pickups")
    @Expose
    private Integer runePickups;
    @SerializedName("runes")
    @Expose
    private Runes runes;
//    @SerializedName("runes_log")
//    @Expose
//    private List<Object> runesLog = null;
    @SerializedName("sen")
    @Expose
    private Sen sen;
//    @SerializedName("sen_left_log")
//    @Expose
//    private List<Object> senLeftLog = null;
//    @SerializedName("sen_log")
//    @Expose
//    private List<Object> senLog = null;
    @SerializedName("sen_placed")
    @Expose
    private Integer senPlaced;
    @SerializedName("stuns")
    @Expose
    private Float stuns;
//    @SerializedName("times")
//    @Expose
//    private List<Object> times = null;
    @SerializedName("tower_damage")
    @Expose
    private Integer towerDamage;
    @SerializedName("xp_per_min")
    @Expose
    private Integer xpPerMin;
    @SerializedName("xp_reasons")
    @Expose
    private XpReasons xpReasons;
//    @SerializedName("xp_t")
//    @Expose
//    private List<Object> xpT = null;
    @SerializedName("personaname")
    @Expose
    private String personaname;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("last_login")
    @Expose
    private Object lastLogin;
    @SerializedName("radiant_win")
    @Expose
    private Boolean radiantWin;
    @SerializedName("start_time")
    @Expose
    private Integer startTime;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("cluster")
    @Expose
    private Integer cluster;
    @SerializedName("lobby_type")
    @Expose
    private Integer lobbyType;
    @SerializedName("game_mode")
    @Expose
    private Integer gameMode;
    @SerializedName("patch")
    @Expose
    private Integer patch;
    @SerializedName("region")
    @Expose
    private Integer region;
    @SerializedName("isRadiant")
    @Expose
    private Boolean isRadiant;
    @SerializedName("win")
    @Expose
    private Integer win;
    @SerializedName("lose")
    @Expose
    private Integer lose;
    @SerializedName("total_gold")
    @Expose
    private Integer totalGold;
    @SerializedName("total_xp")
    @Expose
    private Integer totalXp;
//    @SerializedName("kills_per_min")
//    @Expose
//    private Long killsPerMin;
    @SerializedName("kda")
    @Expose
    private Integer kda;
    @SerializedName("abandons")
    @Expose
    private Integer abandons;
    @SerializedName("neutral_kills")
    @Expose
    private Integer neutralKills;
    @SerializedName("tower_kills")
    @Expose
    private Integer towerKills;
    @SerializedName("courier_kills")
    @Expose
    private Integer courierKills;
    @SerializedName("lane_kills")
    @Expose
    private Integer laneKills;
    @SerializedName("hero_kills")
    @Expose
    private Integer heroKills;
    @SerializedName("observer_kills")
    @Expose
    private Integer observerKills;
    @SerializedName("sentry_kills")
    @Expose
    private Integer sentryKills;
    @SerializedName("roshan_kills")
    @Expose
    private Integer roshanKills;
    @SerializedName("necronomicon_kills")
    @Expose
    private Integer necronomiconKills;
    @SerializedName("ancient_kills")
    @Expose
    private Integer ancientKills;
    @SerializedName("buyback_count")
    @Expose
    private Integer buybackCount;
    @SerializedName("observer_uses")
    @Expose
    private Integer observerUses;
    @SerializedName("sentry_uses")
    @Expose
    private Integer sentryUses;
//    @SerializedName("lane_efficiency")
//    @Expose
//    private Integer laneEfficiency;
    @SerializedName("lane_efficiency_pct")
    @Expose
    private Integer laneEfficiencyPct;
    @SerializedName("lane")
    @Expose
    private Integer lane;
    @SerializedName("lane_role")
    @Expose
    private Integer laneRole;
    @SerializedName("is_roaming")
    @Expose
    private Boolean isRoaming;
    @SerializedName("purchase_time")
    @Expose
    private PurchaseTime purchaseTime;
    @SerializedName("first_purchase_time")
    @Expose
    private FirstPurchaseTime firstPurchaseTime;
    @SerializedName("item_win")
    @Expose
    private ItemWin itemWin;
    @SerializedName("item_usage")
    @Expose
    private ItemUsage itemUsage;
//    @SerializedName("purchase_tpscroll")
//    @Expose
//    private PurchaseTpscroll purchaseTpscroll;
    @SerializedName("actions_per_min")
    @Expose
    private Integer actionsPerMin;
    @SerializedName("life_state_dead")
    @Expose
    private Integer lifeStateDead;
    @SerializedName("rank_tier")
    @Expose
    private Integer rankTier;
//    @SerializedName("cosmetics")
//    @Expose
//    private List<Object> cosmetics = null;
    @SerializedName("benchmarks")
    @Expose
    private Benchmarks benchmarks;

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Integer getPlayerSlot() {
        return playerSlot;
    }

    public void setPlayerSlot(Integer playerSlot) {
        this.playerSlot = playerSlot;
    }

//    public List<Object> getAbilityUpgradesArr() {
//        return abilityUpgradesArr;
//    }
//
//    public void setAbilityUpgradesArr(List<Object> abilityUpgradesArr) {
//        this.abilityUpgradesArr = abilityUpgradesArr;
//    }

    public AbilityUses getAbilityUses() {
        return abilityUses;
    }

    public void setAbilityUses(AbilityUses abilityUses) {
        this.abilityUses = abilityUses;
    }

    public AbilityTargets getAbilityTargets() {
        return abilityTargets;
    }

    public void setAbilityTargets(AbilityTargets abilityTargets) {
        this.abilityTargets = abilityTargets;
    }

    public DamageTargets getDamageTargets() {
        return damageTargets;
    }

    public void setDamageTargets(DamageTargets damageTargets) {
        this.damageTargets = damageTargets;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Actions getActions() {
        return actions;
    }

    public void setActions(Actions actions) {
        this.actions = actions;
    }

    public AdditionalUnits getAdditionalUnits() {
        return additionalUnits;
    }

    public void setAdditionalUnits(AdditionalUnits additionalUnits) {
        this.additionalUnits = additionalUnits;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getBackpack0() {
        return backpack0;
    }

    public void setBackpack0(Integer backpack0) {
        this.backpack0 = backpack0;
    }

    public Integer getBackpack1() {
        return backpack1;
    }

    public void setBackpack1(Integer backpack1) {
        this.backpack1 = backpack1;
    }

    public Integer getBackpack2() {
        return backpack2;
    }

    public void setBackpack2(Integer backpack2) {
        this.backpack2 = backpack2;
    }

//    public List<Object> getBuybackLog() {
//        return buybackLog;
//    }
//
//    public void setBuybackLog(List<Object> buybackLog) {
//        this.buybackLog = buybackLog;
//    }

    public Integer getCampsStacked() {
        return campsStacked;
    }

    public void setCampsStacked(Integer campsStacked) {
        this.campsStacked = campsStacked;
    }

    public Integer getCreepsStacked() {
        return creepsStacked;
    }

    public void setCreepsStacked(Integer creepsStacked) {
        this.creepsStacked = creepsStacked;
    }

    public Damage getDamage() {
        return damage;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public DamageInflictor getDamageInflictor() {
        return damageInflictor;
    }

    public void setDamageInflictor(DamageInflictor damageInflictor) {
        this.damageInflictor = damageInflictor;
    }

    public DamageInflictorReceived getDamageInflictorReceived() {
        return damageInflictorReceived;
    }

    public void setDamageInflictorReceived(DamageInflictorReceived damageInflictorReceived) {
        this.damageInflictorReceived = damageInflictorReceived;
    }

    public DamageTaken getDamageTaken() {
        return damageTaken;
    }

    public void setDamageTaken(DamageTaken damageTaken) {
        this.damageTaken = damageTaken;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getDenies() {
        return denies;
    }

    public void setDenies(Integer denies) {
        this.denies = denies;
    }

//    public List<Object> getDnT() {
//        return dnT;
//    }
//
//    public void setDnT(List<Object> dnT) {
//        this.dnT = dnT;
//    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getGoldPerMin() {
        return goldPerMin;
    }

    public void setGoldPerMin(Integer goldPerMin) {
        this.goldPerMin = goldPerMin;
    }

    public GoldReasons getGoldReasons() {
        return goldReasons;
    }

    public void setGoldReasons(GoldReasons goldReasons) {
        this.goldReasons = goldReasons;
    }

    public Integer getGoldSpent() {
        return goldSpent;
    }

    public void setGoldSpent(Integer goldSpent) {
        this.goldSpent = goldSpent;
    }

//    public List<Object> getGoldT() {
//        return goldT;
//    }
//
//    public void setGoldT(List<Object> goldT) {
//        this.goldT = goldT;
//    }

    public Integer getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(Integer heroDamage) {
        this.heroDamage = heroDamage;
    }

    public Integer getHeroHealing() {
        return heroHealing;
    }

    public void setHeroHealing(Integer heroHealing) {
        this.heroHealing = heroHealing;
    }

    public HeroHits getHeroHits() {
        return heroHits;
    }

    public void setHeroHits(HeroHits heroHits) {
        this.heroHits = heroHits;
    }

    public Integer getHeroId() {
        return heroId;
    }

    public void setHeroId(Integer heroId) {
        this.heroId = heroId;
    }

    public Integer getItem0() {
        return item0;
    }

    public void setItem0(Integer item0) {
        this.item0 = item0;
    }

    public Integer getItem1() {
        return item1;
    }

    public void setItem1(Integer item1) {
        this.item1 = item1;
    }

    public Integer getItem2() {
        return item2;
    }

    public void setItem2(Integer item2) {
        this.item2 = item2;
    }

    public Integer getItem3() {
        return item3;
    }

    public void setItem3(Integer item3) {
        this.item3 = item3;
    }

    public Integer getItem4() {
        return item4;
    }

    public void setItem4(Integer item4) {
        this.item4 = item4;
    }

    public Integer getItem5() {
        return item5;
    }

    public void setItem5(Integer item5) {
        this.item5 = item5;
    }

    public ItemUses getItemUses() {
        return itemUses;
    }

    public void setItemUses(ItemUses itemUses) {
        this.itemUses = itemUses;
    }

    public KillStreaks getKillStreaks() {
        return killStreaks;
    }

    public void setKillStreaks(KillStreaks killStreaks) {
        this.killStreaks = killStreaks;
    }

    public Killed getKilled() {
        return killed;
    }

    public void setKilled(Killed killed) {
        this.killed = killed;
    }

    public KilledBy getKilledBy() {
        return killedBy;
    }

    public void setKilledBy(KilledBy killedBy) {
        this.killedBy = killedBy;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

//    public List<Object> getKillsLog() {
//        return killsLog;
//    }
//
//    public void setKillsLog(List<Object> killsLog) {
//        this.killsLog = killsLog;
//    }

    public LanePos getLanePos() {
        return lanePos;
    }

    public void setLanePos(LanePos lanePos) {
        this.lanePos = lanePos;
    }

    public Integer getLastHits() {
        return lastHits;
    }

    public void setLastHits(Integer lastHits) {
        this.lastHits = lastHits;
    }

    public Integer getLeaverStatus() {
        return leaverStatus;
    }

    public void setLeaverStatus(Integer leaverStatus) {
        this.leaverStatus = leaverStatus;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

//    public List<Object> getLhT() {
//        return lhT;
//    }
//
//    public void setLhT(List<Object> lhT) {
//        this.lhT = lhT;
//    }

    public LifeState getLifeState() {
        return lifeState;
    }

    public void setLifeState(LifeState lifeState) {
        this.lifeState = lifeState;
    }

    public MaxHeroHit getMaxHeroHit() {
        return maxHeroHit;
    }

    public void setMaxHeroHit(MaxHeroHit maxHeroHit) {
        this.maxHeroHit = maxHeroHit;
    }

    public MultiKills getMultiKills() {
        return multiKills;
    }

    public void setMultiKills(MultiKills multiKills) {
        this.multiKills = multiKills;
    }

    public Obs getObs() {
        return obs;
    }

    public void setObs(Obs obs) {
        this.obs = obs;
    }

//    public List<Object> getObsLeftLog() {
//        return obsLeftLog;
//    }
//
//    public void setObsLeftLog(List<Object> obsLeftLog) {
//        this.obsLeftLog = obsLeftLog;
//    }
//
//    public List<Object> getObsLog() {
//        return obsLog;
//    }
//
//    public void setObsLog(List<Object> obsLog) {
//        this.obsLog = obsLog;
//    }

    public Integer getObsPlaced() {
        return obsPlaced;
    }

    public void setObsPlaced(Integer obsPlaced) {
        this.obsPlaced = obsPlaced;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

//    public List<Object> getPermanentBuffs() {
//        return permanentBuffs;
//    }
//
//    public void setPermanentBuffs(List<Object> permanentBuffs) {
//        this.permanentBuffs = permanentBuffs;
//    }

    public Integer getPings() {
        return pings;
    }

    public void setPings(Integer pings) {
        this.pings = pings;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

//    public List<Object> getPurchaseLog() {
//        return purchaseLog;
//    }
//
//    public void setPurchaseLog(List<Object> purchaseLog) {
//        this.purchaseLog = purchaseLog;
//    }

    public Integer getRunePickups() {
        return runePickups;
    }

    public void setRunePickups(Integer runePickups) {
        this.runePickups = runePickups;
    }

    public Runes getRunes() {
        return runes;
    }

    public void setRunes(Runes runes) {
        this.runes = runes;
    }

//    public List<Object> getRunesLog() {
//        return runesLog;
//    }
//
//    public void setRunesLog(List<Object> runesLog) {
//        this.runesLog = runesLog;
//    }

    public Sen getSen() {
        return sen;
    }

    public void setSen(Sen sen) {
        this.sen = sen;
    }

//    public List<Object> getSenLeftLog() {
//        return senLeftLog;
//    }
//
//    public void setSenLeftLog(List<Object> senLeftLog) {
//        this.senLeftLog = senLeftLog;
//    }
//
//    public List<Object> getSenLog() {
//        return senLog;
//    }
//
//    public void setSenLog(List<Object> senLog) {
//        this.senLog = senLog;
//    }

    public Integer getSenPlaced() {
        return senPlaced;
    }

    public void setSenPlaced(Integer senPlaced) {
        this.senPlaced = senPlaced;
    }

    public Float getStuns() {
        return stuns;
    }

    public void setStuns(Float stuns) {
        this.stuns = stuns;
    }

//    public List<Object> getTimes() {
//        return times;
//    }
//
//    public void setTimes(List<Object> times) {
//        this.times = times;
//    }

    public Integer getTowerDamage() {
        return towerDamage;
    }

    public void setTowerDamage(Integer towerDamage) {
        this.towerDamage = towerDamage;
    }

    public Integer getXpPerMin() {
        return xpPerMin;
    }

    public void setXpPerMin(Integer xpPerMin) {
        this.xpPerMin = xpPerMin;
    }

    public XpReasons getXpReasons() {
        return xpReasons;
    }

    public void setXpReasons(XpReasons xpReasons) {
        this.xpReasons = xpReasons;
    }

//    public List<Object> getXpT() {
//        return xpT;
//    }
//
//    public void setXpT(List<Object> xpT) {
//        this.xpT = xpT;
//    }

    public String getPersonaname() {
        return personaname;
    }

    public void setPersonaname(String personaname) {
        this.personaname = personaname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Object lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Boolean getRadiantWin() {
        return radiantWin;
    }

    public void setRadiantWin(Boolean radiantWin) {
        this.radiantWin = radiantWin;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getCluster() {
        return cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public Integer getLobbyType() {
        return lobbyType;
    }

    public void setLobbyType(Integer lobbyType) {
        this.lobbyType = lobbyType;
    }

    public Integer getGameMode() {
        return gameMode;
    }

    public void setGameMode(Integer gameMode) {
        this.gameMode = gameMode;
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

    public Boolean getIsRadiant() {
        return isRadiant;
    }

    public void setIsRadiant(Boolean isRadiant) {
        this.isRadiant = isRadiant;
    }

    public Integer getWin() {
        return win;
    }

    public void setWin(Integer win) {
        this.win = win;
    }

    public Integer getLose() {
        return lose;
    }

    public void setLose(Integer lose) {
        this.lose = lose;
    }

    public Integer getTotalGold() {
        return totalGold;
    }

    public void setTotalGold(Integer totalGold) {
        this.totalGold = totalGold;
    }

    public Integer getTotalXp() {
        return totalXp;
    }

    public void setTotalXp(Integer totalXp) {
        this.totalXp = totalXp;
    }

//    public Integer getKillsPerMin() {
//        return killsPerMin;
//    }
//
//    public void setKillsPerMin(Integer killsPerMin) {
//        this.killsPerMin = killsPerMin;
//    }

    public Integer getKda() {
        return kda;
    }

    public void setKda(Integer kda) {
        this.kda = kda;
    }

    public Integer getAbandons() {
        return abandons;
    }

    public void setAbandons(Integer abandons) {
        this.abandons = abandons;
    }

    public Integer getNeutralKills() {
        return neutralKills;
    }

    public void setNeutralKills(Integer neutralKills) {
        this.neutralKills = neutralKills;
    }

    public Integer getTowerKills() {
        return towerKills;
    }

    public void setTowerKills(Integer towerKills) {
        this.towerKills = towerKills;
    }

    public Integer getCourierKills() {
        return courierKills;
    }

    public void setCourierKills(Integer courierKills) {
        this.courierKills = courierKills;
    }

    public Integer getLaneKills() {
        return laneKills;
    }

    public void setLaneKills(Integer laneKills) {
        this.laneKills = laneKills;
    }

    public Integer getHeroKills() {
        return heroKills;
    }

    public void setHeroKills(Integer heroKills) {
        this.heroKills = heroKills;
    }

    public Integer getObserverKills() {
        return observerKills;
    }

    public void setObserverKills(Integer observerKills) {
        this.observerKills = observerKills;
    }

    public Integer getSentryKills() {
        return sentryKills;
    }

    public void setSentryKills(Integer sentryKills) {
        this.sentryKills = sentryKills;
    }

    public Integer getRoshanKills() {
        return roshanKills;
    }

    public void setRoshanKills(Integer roshanKills) {
        this.roshanKills = roshanKills;
    }

    public Integer getNecronomiconKills() {
        return necronomiconKills;
    }

    public void setNecronomiconKills(Integer necronomiconKills) {
        this.necronomiconKills = necronomiconKills;
    }

    public Integer getAncientKills() {
        return ancientKills;
    }

    public void setAncientKills(Integer ancientKills) {
        this.ancientKills = ancientKills;
    }

    public Integer getBuybackCount() {
        return buybackCount;
    }

    public void setBuybackCount(Integer buybackCount) {
        this.buybackCount = buybackCount;
    }

    public Integer getObserverUses() {
        return observerUses;
    }

    public void setObserverUses(Integer observerUses) {
        this.observerUses = observerUses;
    }

    public Integer getSentryUses() {
        return sentryUses;
    }

    public void setSentryUses(Integer sentryUses) {
        this.sentryUses = sentryUses;
    }

//    public Integer getLaneEfficiency() {
//        return laneEfficiency;
//    }
//
//    public void setLaneEfficiency(Integer laneEfficiency) {
//        this.laneEfficiency = laneEfficiency;
//    }

    public Integer getLaneEfficiencyPct() {
        return laneEfficiencyPct;
    }

    public void setLaneEfficiencyPct(Integer laneEfficiencyPct) {
        this.laneEfficiencyPct = laneEfficiencyPct;
    }

    public Integer getLane() {
        return lane;
    }

    public void setLane(Integer lane) {
        this.lane = lane;
    }

    public Integer getLaneRole() {
        return laneRole;
    }

    public void setLaneRole(Integer laneRole) {
        this.laneRole = laneRole;
    }

    public Boolean getIsRoaming() {
        return isRoaming;
    }

    public void setIsRoaming(Boolean isRoaming) {
        this.isRoaming = isRoaming;
    }

    public PurchaseTime getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(PurchaseTime purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public FirstPurchaseTime getFirstPurchaseTime() {
        return firstPurchaseTime;
    }

    public void setFirstPurchaseTime(FirstPurchaseTime firstPurchaseTime) {
        this.firstPurchaseTime = firstPurchaseTime;
    }

    public ItemWin getItemWin() {
        return itemWin;
    }

    public void setItemWin(ItemWin itemWin) {
        this.itemWin = itemWin;
    }

    public ItemUsage getItemUsage() {
        return itemUsage;
    }

    public void setItemUsage(ItemUsage itemUsage) {
        this.itemUsage = itemUsage;
    }

//    public PurchaseTpscroll getPurchaseTpscroll() {
//        return purchaseTpscroll;
//    }
//
//    public void setPurchaseTpscroll(PurchaseTpscroll purchaseTpscroll) {
//        this.purchaseTpscroll = purchaseTpscroll;
//    }

    public Integer getActionsPerMin() {
        return actionsPerMin;
    }

    public void setActionsPerMin(Integer actionsPerMin) {
        this.actionsPerMin = actionsPerMin;
    }

    public Integer getLifeStateDead() {
        return lifeStateDead;
    }

    public void setLifeStateDead(Integer lifeStateDead) {
        this.lifeStateDead = lifeStateDead;
    }

    public Integer getRankTier() {
        return rankTier;
    }

    public void setRankTier(Integer rankTier) {
        this.rankTier = rankTier;
    }

//    public List<Object> getCosmetics() {
//        return cosmetics;
//    }
//
//    public void setCosmetics(List<Object> cosmetics) {
//        this.cosmetics = cosmetics;
//    }

    public Benchmarks getBenchmarks() {
        return benchmarks;
    }

    public void setBenchmarks(Benchmarks benchmarks) {
        this.benchmarks = benchmarks;
    }

}
