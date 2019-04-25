package cz.mg.vulkan;

public class PFNvkAcquireNextImage2KHX extends VkFunctionPointer {
    public PFNvkAcquireNextImage2KHX() {
    }

    protected PFNvkAcquireNextImage2KHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkAcquireNextImage2KHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkAcquireNextImage2KHX(long value) {
        setValue(value);
    }

    public PFNvkAcquireNextImage2KHX(VkInstance instance) {
        super(instance, new VkString("vkAcquireNextImage2KHX"));
    }

    public void call(VkDevice device, VkAcquireNextImageInfoKHX pAcquireInfo, VkUInt32 pImageIndex, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pAcquireInfo != null ? pAcquireInfo.getVkAddress() : VkPointer.NULL, pImageIndex != null ? pImageIndex.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long pAcquireInfo, long pImageIndex, long rval);
}
