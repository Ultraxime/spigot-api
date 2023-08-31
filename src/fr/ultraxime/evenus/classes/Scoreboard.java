package fr.ultraxime.evenus.classes;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.scoreboard.Criteria;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.RenderType;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Team;

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
        return this.scoreboard.getObjectivesByCriteria(criteria);
    }

    @Override
    public Set<Objective> getObjectives() {
        return this.scoreboard.getObjectives();
    }

    @Override
    public Objective getObjective(DisplaySlot slot) {
        return this.scoreboard.getObjective(slot);
    }

    @Override
    public Set<Score> getScores(OfflinePlayer player) {
        return this.scoreboard.getScores(player);
    }

    @Override
    public Set<Score> getScores(String entry) {
        return this.scoreboard.getScores(entry);
    }

    @Override
    public void resetScores(OfflinePlayer player) {
        this.scoreboard.resetScores(player);
    }

    @Override
    public void resetScores(String entry) {
        this.scoreboard.resetScores(entry);
    }

    @Override
    public Team getPlayerTeam(OfflinePlayer player) {
        return this.scoreboard.getPlayerTeam(player);
    }

    @Override
    public Team getEntryTeam(String entry) {
        return this.scoreboard.getEntryTeam(entry);
    }

    @Override
    public Team getTeam(String teamName) {
        return this.scoreboard.getTeam(teamName);
    }

    @Override
    public Set<Team> getTeams() {
        return this.scoreboard.getTeams();
    }

    @Override
    public Team registerNewTeam(String name) {
        return this.scoreboard.getTeam(name);
    }

    @Override
    public Set<OfflinePlayer> getPlayers() {
        return this.scoreboard.getPlayers();
    }

    @Override
    public Set<String> getEntries() {
        return this.scoreboard.getEntries();
    }

    @Override
    public void clearSlot(DisplaySlot slot) {
        this.scoreboard.clearSlot(slot);
    }
}
