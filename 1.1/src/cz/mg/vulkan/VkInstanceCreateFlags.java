package cz.mg.vulkan;

public class VkInstanceCreateFlags extends VkFlags {
    public VkInstanceCreateFlags() {
    }

    public VkInstanceCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkInstanceCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkInstanceCreateFlags(int value) {
        setValue(value);
    }
}
