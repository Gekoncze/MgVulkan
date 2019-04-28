package cz.mg.vulkan;

public class PFNvkAllocationFunction extends VkFunctionPointer {
    public PFNvkAllocationFunction() {
    }

    protected PFNvkAllocationFunction(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkAllocationFunction(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkAllocationFunction(long value) {
        setValue(value);
    }

    public PFNvkAllocationFunction(VkInstance instance) {
        super(instance, new VkString("vkAllocationFunction"));
    }

    public long call(VkObject pUserData, long size, long alignment, int allocationScope){
        return callNative(getValue(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL, size, alignment, allocationScope);
    }

    protected static native long callNative(long vkaddress, long pUserData, long size, long alignment, int allocationScope);

}
