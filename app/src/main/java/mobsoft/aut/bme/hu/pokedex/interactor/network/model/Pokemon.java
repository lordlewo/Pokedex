package mobsoft.aut.bme.hu.pokedex.interactor.network.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class Pokemon   {
  
  @SerializedName("pokeId")
  private String pokeId = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("type")
  private String type = null;
  
  @SerializedName("weight")
  private String weight = null;
  
  @SerializedName("height")
  private String height = null;
  
  @SerializedName("skill")
  private String skill = null;
  
  @SerializedName("health")
  private String health = null;
  
  @SerializedName("attack")
  private String attack = null;
  
  @SerializedName("defense")
  private String defense = null;
  
  @SerializedName("speed")
  private String speed = null;
  
  @SerializedName("image")
  private String image = null;
  

  
  /**
   * Unique id of the pokemon.
   **/
  @ApiModelProperty(value = "Unique id of the pokemon.")
  public String getPokeId() {
    return pokeId;
  }
  public void setPokeId(String pokeId) {
    this.pokeId = pokeId;
  }

  
  /**
   * Name of the pokemon.
   **/
  @ApiModelProperty(value = "Name of the pokemon.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Type of the pokemon.
   **/
  @ApiModelProperty(value = "Type of the pokemon.")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Weight of the pokemon.
   **/
  @ApiModelProperty(value = "Weight of the pokemon.")
  public String getWeight() {
    return weight;
  }
  public void setWeight(String weight) {
    this.weight = weight;
  }

  
  /**
   * Height of the pokemon.
   **/
  @ApiModelProperty(value = "Height of the pokemon.")
  public String getHeight() {
    return height;
  }
  public void setHeight(String height) {
    this.height = height;
  }

  
  /**
   * Skill of the pokemon.
   **/
  @ApiModelProperty(value = "Skill of the pokemon.")
  public String getSkill() {
    return skill;
  }
  public void setSkill(String skill) {
    this.skill = skill;
  }

  
  /**
   * Healt of the pokemon.
   **/
  @ApiModelProperty(value = "Healt of the pokemon.")
  public String getHealth() {
    return health;
  }
  public void setHealth(String health) {
    this.health = health;
  }

  
  /**
   * Attack of the pokemon.
   **/
  @ApiModelProperty(value = "Attack of the pokemon.")
  public String getAttack() {
    return attack;
  }
  public void setAttack(String attack) {
    this.attack = attack;
  }

  
  /**
   * Defense of the pokemon.
   **/
  @ApiModelProperty(value = "Defense of the pokemon.")
  public String getDefense() {
    return defense;
  }
  public void setDefense(String defense) {
    this.defense = defense;
  }

  
  /**
   * Speed of the pokemon.
   **/
  @ApiModelProperty(value = "Speed of the pokemon.")
  public String getSpeed() {
    return speed;
  }
  public void setSpeed(String speed) {
    this.speed = speed;
  }

  
  /**
   * URL of the cover image.
   **/
  @ApiModelProperty(value = "URL of the cover image.")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pokemon pokemon = (Pokemon) o;
    return Objects.equals(pokeId, pokemon.pokeId) &&
        Objects.equals(name, pokemon.name) &&
        Objects.equals(type, pokemon.type) &&
        Objects.equals(weight, pokemon.weight) &&
        Objects.equals(height, pokemon.height) &&
        Objects.equals(skill, pokemon.skill) &&
        Objects.equals(health, pokemon.health) &&
        Objects.equals(attack, pokemon.attack) &&
        Objects.equals(defense, pokemon.defense) &&
        Objects.equals(speed, pokemon.speed) &&
        Objects.equals(image, pokemon.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pokeId, name, type, weight, height, skill, health, attack, defense, speed, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pokemon {\n");
    
    sb.append("    pokeId: ").append(toIndentedString(pokeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    attack: ").append(toIndentedString(attack)).append("\n");
    sb.append("    defense: ").append(toIndentedString(defense)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
