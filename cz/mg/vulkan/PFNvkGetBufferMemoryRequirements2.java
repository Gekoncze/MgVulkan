package cz.mg.vulkan;

public class PFNvkGetBufferMemoryRequirements2 extends VkFunctionPointer {
    public PFNvkGetBufferMemoryRequirements2() {
    }

    public PFNvkGetBufferMemoryRequirements2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetBufferMemoryRequirements2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetBufferMemoryRequirements2(long value) {
        setValue(value);
    }

    public PFNvkGetBufferMemoryRequirements2(VkInstance instance) {
        super(instance, new VkString("vkGetBufferMemoryRequirements2"));
    }

    public void call(VkDevice device, VkBufferMemoryRequirementsInfo2 pInfo, VkMemoryRequirements2 pMemoryRequirements){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), pInfo != null ? pInfo.getVkAddress() : VkPointer.NULL, pMemoryRequirements != null ? pMemoryRequirements.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pInfo, long pMemoryRequirements);
}
