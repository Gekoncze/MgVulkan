package cz.mg.vulkan;

public abstract class VkHandle extends VkObject {
    public VkHandle(long size) {
        super(size);
    }

    public VkHandle(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkHandle(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkHandle(VkPointer pointer) {
        super(pointer);
    }

    public abstract long getValue();
    public abstract void setValue(long value);
}
