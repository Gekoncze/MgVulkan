package cz.mg.vulkan;

public class PFNvkGetImageMemoryRequirements2 extends VkFunctionPointer {
    public PFNvkGetImageMemoryRequirements2() {
    }

    protected PFNvkGetImageMemoryRequirements2(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetImageMemoryRequirements2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetImageMemoryRequirements2(long value) {
        setValue(value);
    }

    public PFNvkGetImageMemoryRequirements2(VkInstance instance) {
        super(instance, new VkString("vkGetImageMemoryRequirements2"));
    }

    public void call(VkDevice device, VkImageMemoryRequirementsInfo2 pInfo, VkMemoryRequirements2 pMemoryRequirements){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pInfo != null ? pInfo.getVkAddress() : VkPointer.NULL, pMemoryRequirements != null ? pMemoryRequirements.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long pInfo, long pMemoryRequirements);

}
