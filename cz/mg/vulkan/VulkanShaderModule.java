package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkShaderModule.html">khronos documentation</a>
 **/
public class VulkanShaderModule extends VulkanHandle {
    public VulkanShaderModule(){
        super(new VkShaderModule());
    }

    public VulkanShaderModule(VkShaderModule vk){
        super(vk);
    }

    @Override
    public VkShaderModule getVk(){
        return (VkShaderModule) super.getVk();
    }

    public VulkanShaderModule(int value){
        super(new VkShaderModule(value));
    }

    public static class Array extends VulkanShaderModule implements cz.mg.collections.array.ReadonlyArray<VulkanShaderModule> {
        public Array(VkShaderModule.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkShaderModule.Array(count));
        }

        public Array(int count, VulkanShaderModule o){
            this(new VkShaderModule.Array(count, o.getVk()));
        }

        @Override
        public VkShaderModule.Array getVk(){
            return (VkShaderModule.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanShaderModule get(int i){
            return new VulkanShaderModule(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkShaderModule.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkShaderModule.Pointer());
        }

        public Pointer(long value) {
            this(new VkShaderModule.Pointer(value));
        }

        @Override
        public VkShaderModule.Pointer getVk(){
            return (VkShaderModule.Pointer) super.getVk();
        }

        public static class Array extends VulkanShaderModule.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanShaderModule.Pointer> {
            public Array(int count) {
                super(new VkShaderModule.Pointer.Array(count));
            }

            public Array(VulkanShaderModule[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkShaderModule.Pointer.Array getVk(){
                return (VkShaderModule.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanShaderModule.Pointer get(int i){
                return new VulkanShaderModule.Pointer(getVk().get(i));
            }
        }
    }
}
