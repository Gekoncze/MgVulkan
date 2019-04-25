package cz.mg.vulkan;

public class PFNvkGetBufferMemoryRequirements2KHR extends VkFunctionPointer {
    public PFNvkGetBufferMemoryRequirements2KHR() {
    }

    public PFNvkGetBufferMemoryRequirements2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetBufferMemoryRequirements2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetBufferMemoryRequirements2KHR(long value) {
        setValue(value);
    }

    public PFNvkGetBufferMemoryRequirements2KHR(VkInstance instance) {
        super(instance, new VkString("vkGetBufferMemoryRequirements2KHR"));
    }

    public void call(VkDevice device, VkBufferMemoryRequirementsInfo2KHR pInfo, VkMemoryRequirements2KHR pMemoryRequirements){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), pInfo != null ? pInfo.getVkAddress() : VkPointer.NULL, pMemoryRequirements != null ? pMemoryRequirements.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long pInfo, long pMemoryRequirements);
}
