package cz.mg.vulkan;

public class PFNvkGetImageMemoryRequirements2KHR extends VkFunctionPointer {
    public PFNvkGetImageMemoryRequirements2KHR() {
    }

    protected PFNvkGetImageMemoryRequirements2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetImageMemoryRequirements2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetImageMemoryRequirements2KHR(long value) {
        setValue(value);
    }

    public PFNvkGetImageMemoryRequirements2KHR(VkInstance instance) {
        super(instance, new VkString("vkGetImageMemoryRequirements2KHR"));
    }

    public void call(VkDevice device, VkImageMemoryRequirementsInfo2 pInfo, VkMemoryRequirements2 pMemoryRequirements){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pInfo != null ? pInfo.getVkAddress() : VkPointer.NULL, pMemoryRequirements != null ? pMemoryRequirements.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long pInfo, long pMemoryRequirements);

}
