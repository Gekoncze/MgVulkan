package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkValidationCheckEXT.html">khronos documentation</a>
 **/
public class VulkanValidationCheckEXT extends VulkanEnum {
    public static final int VALIDATION_CHECK_ALL_EXT = VkValidationCheckEXT.VK_VALIDATION_CHECK_ALL_EXT;
    public static final int VALIDATION_CHECK_SHADERS_EXT = VkValidationCheckEXT.VK_VALIDATION_CHECK_SHADERS_EXT;

    public VulkanValidationCheckEXT(){
        super(new VkValidationCheckEXT());
    }

    public VulkanValidationCheckEXT(VkValidationCheckEXT vk){
        super(vk);
    }

    @Override
    public VkValidationCheckEXT getVk(){
        return (VkValidationCheckEXT) super.getVk();
    }

    public VulkanValidationCheckEXT(int value){
        super(new VkValidationCheckEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == VALIDATION_CHECK_ALL_EXT) return "VALIDATION_CHECK_ALL_EXT";
        if(getValue() == VALIDATION_CHECK_SHADERS_EXT) return "VALIDATION_CHECK_SHADERS_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VulkanValidationCheckEXT implements cz.mg.collections.array.ReadonlyArray<VulkanValidationCheckEXT> {
        public Array(VkValidationCheckEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkValidationCheckEXT.Array(count));
        }

        public Array(int count, VulkanValidationCheckEXT o){
            this(new VkValidationCheckEXT.Array(count, o.getVk()));
        }

        @Override
        public VkValidationCheckEXT.Array getVk(){
            return (VkValidationCheckEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanValidationCheckEXT get(int i){
            return new VulkanValidationCheckEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkValidationCheckEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkValidationCheckEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkValidationCheckEXT.Pointer(value));
        }

        @Override
        public VkValidationCheckEXT.Pointer getVk(){
            return (VkValidationCheckEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanValidationCheckEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanValidationCheckEXT.Pointer> {
            public Array(int count) {
                super(new VkValidationCheckEXT.Pointer.Array(count));
            }

            public Array(VulkanValidationCheckEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkValidationCheckEXT.Pointer.Array getVk(){
                return (VkValidationCheckEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanValidationCheckEXT.Pointer get(int i){
                return new VulkanValidationCheckEXT.Pointer(getVk().get(i));
            }
        }
    }
}
