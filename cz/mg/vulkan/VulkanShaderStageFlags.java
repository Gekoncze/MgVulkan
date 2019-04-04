package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkShaderStageFlags.html">khronos documentation</a>
 **/
public class VulkanShaderStageFlags extends VulkanFlags {
    public VulkanShaderStageFlags(){
        super(new VkShaderStageFlags());
    }

    public VulkanShaderStageFlags(VkShaderStageFlags vk){
        super(vk);
    }

    @Override
    public VkShaderStageFlags getVk(){
        return (VkShaderStageFlags) super.getVk();
    }

    public VulkanShaderStageFlags(int value){
        super(new VkShaderStageFlags(value));
    }

    public static class Array extends VulkanShaderStageFlags implements cz.mg.collections.array.ReadonlyArray<VulkanShaderStageFlags> {
        public Array(VkShaderStageFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkShaderStageFlags.Array(count));
        }

        public Array(int count, VulkanShaderStageFlags o){
            this(new VkShaderStageFlags.Array(count, o.getVk()));
        }

        @Override
        public VkShaderStageFlags.Array getVk(){
            return (VkShaderStageFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanShaderStageFlags get(int i){
            return new VulkanShaderStageFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkShaderStageFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkShaderStageFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkShaderStageFlags.Pointer(value));
        }

        @Override
        public VkShaderStageFlags.Pointer getVk(){
            return (VkShaderStageFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanShaderStageFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanShaderStageFlags.Pointer> {
            public Array(int count) {
                super(new VkShaderStageFlags.Pointer.Array(count));
            }

            public Array(VulkanShaderStageFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkShaderStageFlags.Pointer.Array getVk(){
                return (VkShaderStageFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanShaderStageFlags.Pointer get(int i){
                return new VulkanShaderStageFlags.Pointer(getVk().get(i));
            }
        }
    }
}
