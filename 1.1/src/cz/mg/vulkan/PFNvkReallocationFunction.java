package cz.mg.vulkan;

public class PFNvkReallocationFunction extends VkFunctionPointer {
    public PFNvkReallocationFunction() {
    }

    public PFNvkReallocationFunction(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkReallocationFunction(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkReallocationFunction(long value) {
        setValue(value);
    }

    public void call(VkObject pUserData, VkObject pOriginal, VkSize size, VkSize alignment, VkSystemAllocationScope allocationScope){
        call(getValue(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL, pOriginal != null ? pOriginal.getVkAddress() : VkPointer.NULL, size != null ? size.getVkAddress() : VkPointer.getNullAddressNative(), alignment != null ? alignment.getVkAddress() : VkPointer.getNullAddressNative(), allocationScope != null ? allocationScope.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long pUserData, long pOriginal, long size, long alignment, long allocationScope);
}
