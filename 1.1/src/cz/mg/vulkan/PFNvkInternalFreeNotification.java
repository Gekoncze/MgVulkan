package cz.mg.vulkan;

public class PFNvkInternalFreeNotification extends VkFunctionPointer {
    public PFNvkInternalFreeNotification() {
    }

    protected PFNvkInternalFreeNotification(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkInternalFreeNotification(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkInternalFreeNotification(long value) {
        setValue(value);
    }

    public PFNvkInternalFreeNotification(VkInstance instance) {
        super(instance, new VkString("vkInternalFreeNotification"));
    }

    public void call(VkObject pUserData, VkSize size, VkInternalAllocationType allocationType, VkSystemAllocationScope allocationScope){
        callNative(getValue(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL, size != null ? size.getVkAddress() : VkPointer.getNullAddressNative(), allocationType != null ? allocationType.getVkAddress() : VkPointer.getNullAddressNative(), allocationScope != null ? allocationScope.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long pUserData, long size, long allocationType, long allocationScope);


    public void call(VkObject pUserData, long size, int allocationType, int allocationScope){
        callSimplifiedNative(getValue(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL, size, allocationType, allocationScope);
    }

    protected static native void callSimplifiedNative(long vkaddress, long pUserData, long size, int allocationType, int allocationScope);

}
