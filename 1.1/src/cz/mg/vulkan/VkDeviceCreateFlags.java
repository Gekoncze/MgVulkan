package cz.mg.vulkan;

public class VkDeviceCreateFlags extends VkFlags {
    public VkDeviceCreateFlags() {
    }

    public VkDeviceCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDeviceCreateFlags(int value) {
        setValue(value);
    }
}
