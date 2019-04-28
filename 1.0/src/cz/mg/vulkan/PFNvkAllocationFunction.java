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

    public void call(VkObject pUserData, VkSize size, VkSize alignment, VkSystemAllocationScope allocationScope, VkObject rval){
        callNative(getValue(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL, size != null ? size.getVkAddress() : VkPointer.getNullAddressNative(), alignment != null ? alignment.getVkAddress() : VkPointer.getNullAddressNative(), allocationScope != null ? allocationScope.getVkAddress() : VkPointer.getNullAddressNative(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long pUserData, long size, long alignment, long allocationScope, long rval);



}
