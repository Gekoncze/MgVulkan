package cz.mg.vulkan;

public class VkFrontFace extends VkEnum {
    public static final int VK_FRONT_FACE_COUNTER_CLOCKWISE = 0;
    public static final int VK_FRONT_FACE_CLOCKWISE = 1;

    public VkFrontFace() {
    }

    public VkFrontFace(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFrontFace(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkFrontFace(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_FRONT_FACE_COUNTER_CLOCKWISE) return "VK_FRONT_FACE_COUNTER_CLOCKWISE";
        if(getValue() == VK_FRONT_FACE_CLOCKWISE) return "VK_FRONT_FACE_CLOCKWISE";
        return "UNKNOWN";
    }
}
