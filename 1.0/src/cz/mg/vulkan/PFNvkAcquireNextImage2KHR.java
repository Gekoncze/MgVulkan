package cz.mg.vulkan;

public class PFNvkAcquireNextImage2KHR extends VkFunctionPointer {
    public PFNvkAcquireNextImage2KHR() {
    }

    protected PFNvkAcquireNextImage2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkAcquireNextImage2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkAcquireNextImage2KHR(long value) {
        setValue(value);
    }

    public PFNvkAcquireNextImage2KHR(VkInstance instance) {
        super(instance, new VkString("vkAcquireNextImage2KHR"));
    }

    public int call(VkDevice device, VkAcquireNextImageInfoKHR pAcquireInfo, VkUInt32 pImageIndex){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pAcquireInfo != null ? pAcquireInfo.getVkAddress() : VkPointer.NULL, pImageIndex != null ? pImageIndex.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pAcquireInfo, long pImageIndex);

}
