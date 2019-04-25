package cz.mg.vulkan;

public class VkRenderPassCreateFlags extends VkFlags {
    public VkRenderPassCreateFlags() {
    }

    protected VkRenderPassCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkRenderPassCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkRenderPassCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkRenderPassCreateFlags(int value) {
        setValue(value);
    }
}
