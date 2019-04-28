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

    public void call(VkObject pUserData, VkObject pOriginal, VkSize size, VkSize alignment, VkSystemAllocationScope allocationScope, VkObject rval){
        callNative(getValue(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL, pOriginal != null ? pOriginal.getVkAddress() : VkPointer.NULL, size != null ? size.getVkAddress() : VkPointer.getNullAddressNative(), alignment != null ? alignment.getVkAddress() : VkPointer.getNullAddressNative(), allocationScope != null ? allocationScope.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long pUserData, long pOriginal, long size, long alignment, long allocationScope, long rval);



}
