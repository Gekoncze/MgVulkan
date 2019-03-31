package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetFenceStatus.html">khronos documentation</a>
 **/
public class PFNvkGetFenceStatus extends VkFunctionPointer {
    public PFNvkGetFenceStatus() {
    }

    public PFNvkGetFenceStatus(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetFenceStatus(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetFenceStatus(long value) {
        setValue(value);
    }

    public PFNvkGetFenceStatus(VkInstance instance) {
        super(instance, new VkString("vkGetFenceStatus"));
    }

    public void call(VkDevice device, VkFence fence, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), fence != null ? fence.getVkAddress() : VkFence.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long fence, long rval);
}
