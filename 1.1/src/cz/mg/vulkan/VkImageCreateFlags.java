package cz.mg.vulkan;

public class VkImageCreateFlags extends VkFlags {
    public VkImageCreateFlags() {
    }

    public VkImageCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkImageCreateFlags(int value) {
        setValue(value);
    }
}
