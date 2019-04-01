package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetInstanceProcAddr.html">khronos documentation</a>
 **/
public class PFNvkGetInstanceProcAddr extends VkFunctionPointer {
    public PFNvkGetInstanceProcAddr() {
    }

    public PFNvkGetInstanceProcAddr(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetInstanceProcAddr(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetInstanceProcAddr(long value) {
        setValue(value);
    }

    public PFNvkGetInstanceProcAddr(VkInstance instance) {
        super(instance, new VkString("vkGetInstanceProcAddr"));
    }

    public void call(VkInstance instance, VkChar pName, PFNvkVoidFunction rval){
        call(getValue(), instance != null ? instance.getVkAddress() : VkPointer.NULL_ADDRESS, pName != null ? pName.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long instance, long pName, long rval);
}
