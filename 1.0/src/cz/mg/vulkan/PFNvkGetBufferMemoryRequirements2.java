package cz.mg.vulkan;

public class PFNvkGetBufferMemoryRequirements2 extends VkFunctionPointer {
    public PFNvkGetBufferMemoryRequirements2() {
    }

    protected PFNvkGetBufferMemoryRequirements2(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetBufferMemoryRequirements2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetBufferMemoryRequirements2(long value) {
        setValue(value);
    }

    public PFNvkGetBufferMemoryRequirements2(VkInstance instance) {
        super(instance, new VkString("vkGetBufferMemoryRequirements2"));
    }

    public void call(VkDevice device, VkBufferMemoryRequirementsInfo2 pInfo, VkMemoryRequirements2 pMemoryRequirements){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pInfo != null ? pInfo.getVkAddress() : VkPointer.NULL, pMemoryRequirements != null ? pMemoryRequirements.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long pInfo, long pMemoryRequirements);



}
