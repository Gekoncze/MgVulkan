package cz.mg.vulkan;

public class PFNvkReallocationFunction extends VkFunctionPointer {
    public PFNvkReallocationFunction() {
    }

    protected PFNvkReallocationFunction(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkReallocationFunction(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkReallocationFunction(long value) {
        setValue(value);
    }

    public PFNvkReallocationFunction(VkInstance instance) {
        super(instance, new VkString("vkReallocationFunction"));
    }

    public long call(VkObject pUserData, VkObject pOriginal, long size, long alignment, int allocationScope){
        return callNative(getValue(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL, pOriginal != null ? pOriginal.getVkAddress() : VkPointer.NULL, size, alignment, allocationScope);
    }

    protected static native long callNative(long vkaddress, long pUserData, long pOriginal, long size, long alignment, int allocationScope);

}
