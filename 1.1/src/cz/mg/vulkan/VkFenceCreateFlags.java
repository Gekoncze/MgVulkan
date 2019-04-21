package cz.mg.vulkan;

public class VkFenceCreateFlags extends VkFlags {
    public VkFenceCreateFlags() {
    }

    public VkFenceCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFenceCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkFenceCreateFlags(int value) {
        setValue(value);
    }
}
