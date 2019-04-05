package cz.mg.vulkan.vk;

public class PFNvkGetImageMemoryRequirements extends VkFunctionPointer {
    public PFNvkGetImageMemoryRequirements() {
    }

    public PFNvkGetImageMemoryRequirements(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetImageMemoryRequirements(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetImageMemoryRequirements(long value) {
        setValue(value);
    }

    public PFNvkGetImageMemoryRequirements(VkInstance instance) {
        super(instance, new VkString("vkGetImageMemoryRequirements"));
    }

    public void call(VkDevice device, VkImage image, VkMemoryRequirements pMemoryRequirements){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, image != null ? image.getVkAddress() : VkPointer.NULL_ADDRESS, pMemoryRequirements != null ? pMemoryRequirements.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long image, long pMemoryRequirements);
}
