package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkShaderModuleCreateFlags.html">khronos documentation</a>
 **/
public class VulkanShaderModuleCreateFlags extends VulkanFlags {
    public VulkanShaderModuleCreateFlags(){
        super(new VkShaderModuleCreateFlags());
    }

    public VulkanShaderModuleCreateFlags(VkShaderModuleCreateFlags vk){
        super(vk);
    }

    @Override
    public VkShaderModuleCreateFlags getVk(){
        return (VkShaderModuleCreateFlags) super.getVk();
    }

    public VulkanShaderModuleCreateFlags(int value){
        super(new VkShaderModuleCreateFlags(value));
    }

    public static class Array extends VulkanShaderModuleCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanShaderModuleCreateFlags> {
        public Array(VkShaderModuleCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkShaderModuleCreateFlags.Array(count));
        }

        public Array(int count, VulkanShaderModuleCreateFlags o){
            this(new VkShaderModuleCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkShaderModuleCreateFlags.Array getVk(){
            return (VkShaderModuleCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanShaderModuleCreateFlags get(int i){
            return new VulkanShaderModuleCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkShaderModuleCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkShaderModuleCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkShaderModuleCreateFlags.Pointer(value));
        }

        @Override
        public VkShaderModuleCreateFlags.Pointer getVk(){
            return (VkShaderModuleCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanShaderModuleCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanShaderModuleCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkShaderModuleCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanShaderModuleCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkShaderModuleCreateFlags.Pointer.Array getVk(){
                return (VkShaderModuleCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanShaderModuleCreateFlags.Pointer get(int i){
                return new VulkanShaderModuleCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
