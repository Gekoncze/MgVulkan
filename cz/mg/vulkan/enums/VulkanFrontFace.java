package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkFrontFace;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanFrontFace {
    public static final int COUNTER_CLOCKWISE = VkFrontFace.VK_FRONT_FACE_COUNTER_CLOCKWISE;
    public static final int CLOCKWISE = VkFrontFace.VK_FRONT_FACE_CLOCKWISE;

    public final VkFrontFace enums;

    public VulkanFrontFace() {
        this(0);
    }

    public VulkanFrontFace(int value) {
        this(new VkFrontFace(value));
    }

    public VulkanFrontFace(VkFrontFace enums) {
        this.enums = enums;
    }

    public boolean is(int value){
        return this.enums.value == value;
    }

    public void set(int value){
        this.enums.value = value;
    }

    @Override
    public String toString() {
        return ToString.constantToString(enums.value, VkFrontFace.class);
    }
}
