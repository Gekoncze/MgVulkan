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

    public void call(VkObject pUserData, VkSize size, VkSize alignment, VkSystemAllocationScope allocationScope){
        call(getValue(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL, size != null ? size.getVkAddress() : VkPointer.getNullAddressNative(), alignment != null ? alignment.getVkAddress() : VkPointer.getNullAddressNative(), allocationScope != null ? allocationScope.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long pUserData, long size, long alignment, long allocationScope);
}
