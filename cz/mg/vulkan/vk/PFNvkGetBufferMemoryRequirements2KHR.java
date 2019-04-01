package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetBufferMemoryRequirements2KHR.html">khronos documentation</a>
 **/
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

    public void call(VkDevice device, VkBufferMemoryRequirementsInfo2 pInfo, VkMemoryRequirements2 pMemoryRequirements){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pInfo != null ? pInfo.getVkAddress() : VkPointer.NULL, pMemoryRequirements != null ? pMemoryRequirements.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pInfo, long pMemoryRequirements);
}
