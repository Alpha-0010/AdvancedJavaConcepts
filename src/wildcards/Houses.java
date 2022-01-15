/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wildcards;

import lombok.*;

/**
 *
 * @author shashwat
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Houses extends Buildings {
    int numberOfRooms=2;
    public String toString(){
        return "House";
    }
}
