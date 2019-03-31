package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetImageMemoryRequirements2.html">khronos documentation</a>
 **/
public class PFNvkGetImageMemoryRequirements2 extends VkFunctionPointer {
    public PFNvkGetImageMemoryRequirements2() {
    }

    public PFNvkGetImageMemoryRequirements2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetImageMemoryRequirements2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetImageMemoryRequirements2(long value) {
        setValue(value);
    }

    public PFNvkGetImageMemoryRequirements2(VkInstance instance) {
        super(instance, new VkString("vkGetImageMemoryRequirements2"));
    }

    public void call(VkDevice device, VkImageMemoryRequirementsInfo2 pInfo, VkMemoryRequirements2 pMemoryRequirements){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pInfo != null ? pInfo.getVkAddress() : VkPointer.NULL, pMemoryRequirements != null ? pMemoryRequirements.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pInfo, long pMemoryRequirements);
}
