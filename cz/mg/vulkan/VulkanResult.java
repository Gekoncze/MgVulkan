package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkResult.html">khronos documentation</a>
 **/
public class VulkanResult extends VulkanEnum {
    public static final int SUCCESS = VkResult.VK_SUCCESS;
    public static final int NOT_READY = VkResult.VK_NOT_READY;
    public static final int TIMEOUT = VkResult.VK_TIMEOUT;
    public static final int EVENT_SET = VkResult.VK_EVENT_SET;
    public static final int EVENT_RESET = VkResult.VK_EVENT_RESET;
    public static final int INCOMPLETE = VkResult.VK_INCOMPLETE;
    public static final int ERROR_OUT_OF_HOST_MEMORY = VkResult.VK_ERROR_OUT_OF_HOST_MEMORY;
    public static final int ERROR_OUT_OF_DEVICE_MEMORY = VkResult.VK_ERROR_OUT_OF_DEVICE_MEMORY;
    public static final int ERROR_INITIALIZATION_FAILED = VkResult.VK_ERROR_INITIALIZATION_FAILED;
    public static final int ERROR_DEVICE_LOST = VkResult.VK_ERROR_DEVICE_LOST;
    public static final int ERROR_MEMORY_MAP_FAILED = VkResult.VK_ERROR_MEMORY_MAP_FAILED;
    public static final int ERROR_LAYER_NOT_PRESENT = VkResult.VK_ERROR_LAYER_NOT_PRESENT;
    public static final int ERROR_EXTENSION_NOT_PRESENT = VkResult.VK_ERROR_EXTENSION_NOT_PRESENT;
    public static final int ERROR_FEATURE_NOT_PRESENT = VkResult.VK_ERROR_FEATURE_NOT_PRESENT;
    public static final int ERROR_INCOMPATIBLE_DRIVER = VkResult.VK_ERROR_INCOMPATIBLE_DRIVER;
    public static final int ERROR_TOO_MANY_OBJECTS = VkResult.VK_ERROR_TOO_MANY_OBJECTS;
    public static final int ERROR_FORMAT_NOT_SUPPORTED = VkResult.VK_ERROR_FORMAT_NOT_SUPPORTED;
    public static final int ERROR_FRAGMENTED_POOL = VkResult.VK_ERROR_FRAGMENTED_POOL;
    public static final int ERROR_OUT_OF_POOL_MEMORY = VkResult.VK_ERROR_OUT_OF_POOL_MEMORY;
    public static final int ERROR_INVALID_EXTERNAL_HANDLE = VkResult.VK_ERROR_INVALID_EXTERNAL_HANDLE;
    public static final int ERROR_SURFACE_LOST_KHR = VkResult.VK_ERROR_SURFACE_LOST_KHR;
    public static final int ERROR_NATIVE_WINDOW_IN_USE_KHR = VkResult.VK_ERROR_NATIVE_WINDOW_IN_USE_KHR;
    public static final int SUBOPTIMAL_KHR = VkResult.VK_SUBOPTIMAL_KHR;
    public static final int ERROR_OUT_OF_DATE_KHR = VkResult.VK_ERROR_OUT_OF_DATE_KHR;
    public static final int ERROR_INCOMPATIBLE_DISPLAY_KHR = VkResult.VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;
    public static final int ERROR_VALIDATION_FAILED_EXT = VkResult.VK_ERROR_VALIDATION_FAILED_EXT;
    public static final int ERROR_INVALID_SHADER_NV = VkResult.VK_ERROR_INVALID_SHADER_NV;
    public static final int ERROR_FRAGMENTATION_EXT = VkResult.VK_ERROR_FRAGMENTATION_EXT;
    public static final int ERROR_NOT_PERMITTED_EXT = VkResult.VK_ERROR_NOT_PERMITTED_EXT;
    public static final int ERROR_OUT_OF_POOL_MEMORY_KHR = VkResult.VK_ERROR_OUT_OF_POOL_MEMORY_KHR;
    public static final int ERROR_INVALID_EXTERNAL_HANDLE_KHR = VkResult.VK_ERROR_INVALID_EXTERNAL_HANDLE_KHR;

    public VulkanResult(){
        super(new VkResult());
    }

    public VulkanResult(VkResult vk){
        super(vk);
    }

    @Override
    public VkResult getVk(){
        return (VkResult) super.getVk();
    }

    public VulkanResult(int value){
        super(new VkResult(value));
    }

    @Override
    public String toString() {
        if(getValue() == SUCCESS) return "SUCCESS";
        if(getValue() == NOT_READY) return "NOT_READY";
        if(getValue() == TIMEOUT) return "TIMEOUT";
        if(getValue() == EVENT_SET) return "EVENT_SET";
        if(getValue() == EVENT_RESET) return "EVENT_RESET";
        if(getValue() == INCOMPLETE) return "INCOMPLETE";
        if(getValue() == ERROR_OUT_OF_HOST_MEMORY) return "ERROR_OUT_OF_HOST_MEMORY";
        if(getValue() == ERROR_OUT_OF_DEVICE_MEMORY) return "ERROR_OUT_OF_DEVICE_MEMORY";
        if(getValue() == ERROR_INITIALIZATION_FAILED) return "ERROR_INITIALIZATION_FAILED";
        if(getValue() == ERROR_DEVICE_LOST) return "ERROR_DEVICE_LOST";
        if(getValue() == ERROR_MEMORY_MAP_FAILED) return "ERROR_MEMORY_MAP_FAILED";
        if(getValue() == ERROR_LAYER_NOT_PRESENT) return "ERROR_LAYER_NOT_PRESENT";
        if(getValue() == ERROR_EXTENSION_NOT_PRESENT) return "ERROR_EXTENSION_NOT_PRESENT";
        if(getValue() == ERROR_FEATURE_NOT_PRESENT) return "ERROR_FEATURE_NOT_PRESENT";
        if(getValue() == ERROR_INCOMPATIBLE_DRIVER) return "ERROR_INCOMPATIBLE_DRIVER";
        if(getValue() == ERROR_TOO_MANY_OBJECTS) return "ERROR_TOO_MANY_OBJECTS";
        if(getValue() == ERROR_FORMAT_NOT_SUPPORTED) return "ERROR_FORMAT_NOT_SUPPORTED";
        if(getValue() == ERROR_FRAGMENTED_POOL) return "ERROR_FRAGMENTED_POOL";
        if(getValue() == ERROR_OUT_OF_POOL_MEMORY) return "ERROR_OUT_OF_POOL_MEMORY";
        if(getValue() == ERROR_INVALID_EXTERNAL_HANDLE) return "ERROR_INVALID_EXTERNAL_HANDLE";
        if(getValue() == ERROR_SURFACE_LOST_KHR) return "ERROR_SURFACE_LOST_KHR";
        if(getValue() == ERROR_NATIVE_WINDOW_IN_USE_KHR) return "ERROR_NATIVE_WINDOW_IN_USE_KHR";
        if(getValue() == SUBOPTIMAL_KHR) return "SUBOPTIMAL_KHR";
        if(getValue() == ERROR_OUT_OF_DATE_KHR) return "ERROR_OUT_OF_DATE_KHR";
        if(getValue() == ERROR_INCOMPATIBLE_DISPLAY_KHR) return "ERROR_INCOMPATIBLE_DISPLAY_KHR";
        if(getValue() == ERROR_VALIDATION_FAILED_EXT) return "ERROR_VALIDATION_FAILED_EXT";
        if(getValue() == ERROR_INVALID_SHADER_NV) return "ERROR_INVALID_SHADER_NV";
        if(getValue() == ERROR_FRAGMENTATION_EXT) return "ERROR_FRAGMENTATION_EXT";
        if(getValue() == ERROR_NOT_PERMITTED_EXT) return "ERROR_NOT_PERMITTED_EXT";
        if(getValue() == ERROR_OUT_OF_POOL_MEMORY_KHR) return "ERROR_OUT_OF_POOL_MEMORY_KHR";
        if(getValue() == ERROR_INVALID_EXTERNAL_HANDLE_KHR) return "ERROR_INVALID_EXTERNAL_HANDLE_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VulkanResult implements cz.mg.collections.array.ReadonlyArray<VulkanResult> {
        public Array(VkResult.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkResult.Array(count));
        }

        public Array(int count, VulkanResult o){
            this(new VkResult.Array(count, o.getVk()));
        }

        @Override
        public VkResult.Array getVk(){
            return (VkResult.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanResult get(int i){
            return new VulkanResult(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkResult.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkResult.Pointer());
        }

        public Pointer(long value) {
            this(new VkResult.Pointer(value));
        }

        @Override
        public VkResult.Pointer getVk(){
            return (VkResult.Pointer) super.getVk();
        }

        public static class Array extends VulkanResult.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanResult.Pointer> {
            public Array(int count) {
                super(new VkResult.Pointer.Array(count));
            }

            public Array(VulkanResult[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkResult.Pointer.Array getVk(){
                return (VkResult.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanResult.Pointer get(int i){
                return new VulkanResult.Pointer(getVk().get(i));
            }
        }
    }
}
