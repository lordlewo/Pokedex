package mobsoft.aut.bme.hu.pokedex.model;

import com.orm.SugarRecord;
import com.orm.dsl.Table;

@Table
public class Pokemon extends SugarRecord{

    private int _number;
    private String _name;
    private String _type;
    private float _weight;
    private float _height;
    private String _skill;
    private int _health;
    private int _attack;
    private int _defense;
    private int _speed;
    private String _advantage;
    private String _disadvantage;

    public Pokemon(){}

    public int getNumber() {
        return _number;
    }

    public void setNumber(int number) {
        this._number = number;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getType() {
        return _type;
    }

    public void setType(String type) {
        this._type = type;
    }

    public float getWeight() {
        return _weight;
    }

    public void setWeight(float weight) {
        this._weight = weight;
    }

    public float getHeight() {
        return _height;
    }

    public void setHeight(float height) {
        this._height = height;
    }

    public String getSkill() {
        return _skill;
    }

    public void setSkill(String skill) {
        this._skill = skill;
    }

    public int getHealth() {
        return _health;
    }

    public void setHealth(int health) {
        this._health = health;
    }

    public int getAttack() {
        return _attack;
    }

    public void setAttack(int attack) {
        this._attack = attack;
    }

    public int getDefense() {
        return _defense;
    }

    public void setDefense(int defense) {
        this._defense = defense;
    }

    public int getSpeed() {
        return _speed;
    }

    public void setSpeed(int speed) {
        this._speed = speed;
    }

    public String getAdvantage() {
        return _advantage;
    }

    public void setAdvantage(String advantage) {
        this._advantage = advantage;
    }

    public String getDisadvantage() {
        return _disadvantage;
    }

    public void setDisadvantage(String disadvantage) {
        this._disadvantage = disadvantage;
    }
}
