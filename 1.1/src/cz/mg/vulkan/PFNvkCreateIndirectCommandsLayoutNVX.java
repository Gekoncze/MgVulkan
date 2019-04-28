package cz.mg.vulkan;

public class PFNvkCreateIndirectCommandsLayoutNVX extends VkFunctionPointer {
    public PFNvkCreateIndirectCommandsLayoutNVX() {
    }

    protected PFNvkCreateIndirectCommandsLayoutNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateIndirectCommandsLayoutNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateIndirectCommandsLayoutNVX(long value) {
        setValue(value);
    }

    public PFNvkCreateIndirectCommandsLayoutNVX(VkInstance instance) {
        super(instance, new VkString("vkCreateIndirectCommandsLayoutNVX"));
    }

    public int call(VkDevice device, VkIndirectCommandsLayoutCreateInfoNVX pCreateInfo, VkAllocationCallbacks pAllocator, VkIndirectCommandsLayoutNVX pIndirectCommandsLayout){
        return callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pIndirectCommandsLayout != null ? pIndirectCommandsLayout.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pIndirectCommandsLayout);

}
