package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineLayout.html">khronos documentation</a>
 **/
public class VulkanPipelineLayout extends VulkanHandle {
    public VulkanPipelineLayout(){
        super(new VkPipelineLayout());
    }

    public VulkanPipelineLayout(VkPipelineLayout vk){
        super(vk);
    }

    @Override
    public VkPipelineLayout getVk(){
        return (VkPipelineLayout) super.getVk();
    }

    public VulkanPipelineLayout(int value){
        super(new VkPipelineLayout(value));
    }

    public static class Array extends VulkanPipelineLayout implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineLayout> {
        public Array(VkPipelineLayout.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineLayout.Array(count));
        }

        public Array(int count, VulkanPipelineLayout o){
            this(new VkPipelineLayout.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineLayout.Array getVk(){
            return (VkPipelineLayout.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineLayout get(int i){
            return new VulkanPipelineLayout(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineLayout.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineLayout.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineLayout.Pointer(value));
        }

        @Override
        public VkPipelineLayout.Pointer getVk(){
            return (VkPipelineLayout.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineLayout.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineLayout.Pointer> {
            public Array(int count) {
                super(new VkPipelineLayout.Pointer.Array(count));
            }

            public Array(VulkanPipelineLayout[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineLayout.Pointer.Array getVk(){
                return (VkPipelineLayout.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineLayout.Pointer get(int i){
                return new VulkanPipelineLayout.Pointer(getVk().get(i));
            }
        }
    }
}
