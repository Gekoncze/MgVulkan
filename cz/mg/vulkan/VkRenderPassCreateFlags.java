package cz.mg.vulkan;

public class VkRenderPassCreateFlags extends VkFlags {
    public VkRenderPassCreateFlags() {
    }

    public VkRenderPassCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkRenderPassCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkRenderPassCreateFlags(int value) {
        setValue(value);
    }
}
