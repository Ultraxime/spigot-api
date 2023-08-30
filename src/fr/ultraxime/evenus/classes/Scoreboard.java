package fr.ultraxime.evenus.classes;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.scoreboard.*;

import java.util.Objects;
import java.util.Set;

public class Scoreboard implements org.bukkit.scoreboard.Scoreboard {
    protected final org.bukkit.scoreboard.Scoreboard scoreboard;
    private final Plugin plugin;

    Scoreboard(Plugin _plugin){
        this.plugin = _plugin;
        this.scoreboard = Objects.requireNonNull(Bukkit.getScoreboardManager()).getNewScoreboard();
    }

    Scoreboard(Plugin _plugin, org.bukkit.scoreboard.Scoreboard _scoreboard){
        this.plugin = _plugin;
        this.scoreboard = _scoreboard;
    }

    @Override
    public Objective registerNewObjective(String name, String criteria) {
        return this.scoreboard.registerNewObjective(name, Criteria.create(criteria), name);
    }

    @Override
    public Objective registerNewObjective(String name, String criteria, String displayName) {
        return this.scoreboard.registerNewObjective(name, Criteria.create(criteria), displayName);
    }

    @Override
    public Objective registerNewObjective(String name, String criteria, String displayName, RenderType renderType) {
        return this.scoreboard.registerNewObjective(name, Criteria.create(criteria), displayName, renderType);
    }

    @Override
    public Objective registerNewObjective(String name, Criteria criteria, String displayName) {
        return this.scoreboard.registerNewObjective(name, criteria, displayName);
    }

    @Override
    public Objective registerNewObjective(String name, Criteria criteria, String displayName, RenderType renderType) {
        return this.scoreboard.registerNewObjective(name, criteria, displayName, renderType);
    }

    @Override
    public Objective getObjective(String name) {
        return this.scoreboard.getObjective(name);
    }

    @Override
    public Set<Objective> getObjectivesByCriteria(String criteria) {
        return this.scoreboard.getObjectivesByCriteria(Criteria.create(criteria));
    }

    // TODO I'll let you finish the implementation

    @Override
    public Set<Objective> getObjectivesByCriteria(Criteria criteria) {
        return null;
    }

    @Override
    public Set<Objective> getObjectives() {
        return null;
    }

    @Override
    public Objective getObjective(DisplaySlot displaySlot) {
        return null;
    }

    @Override
    public Set<Score> getScores(OfflinePlayer offlinePlayer) {
        return null;
    }

    @Override
    public Set<Score> getScores(String s) {
        return null;
    }

    @Override
    public void resetScores(OfflinePlayer offlinePlayer) {

    }

    @Override
    public void resetScores(String s) {

    }

    @Override
    public Team getPlayerTeam(OfflinePlayer offlinePlayer) {
        return null;
    }

    @Override
    public Team getEntryTeam(String s) {
        return null;
    }

    @Override
    public Team getTeam(String s) {
        return null;
    }

    @Override
    public Set<Team> getTeams() {
        return null;
    }

    @Override
    public Team registerNewTeam(String s) {
        return null;
    }

    @Override
    public Set<OfflinePlayer> getPlayers() {
        return null;
    }

    @Override
    public Set<String> getEntries() {
        return null;
    }

    @Override
    public void clearSlot(DisplaySlot displaySlot) {

    }
}
