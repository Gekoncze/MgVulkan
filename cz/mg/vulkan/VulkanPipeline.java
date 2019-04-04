package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipeline.html">khronos documentation</a>
 **/
public class VulkanPipeline extends VulkanHandle {
    public VulkanPipeline(){
        super(new VkPipeline());
    }

    public VulkanPipeline(VkPipeline vk){
        super(vk);
    }

    @Override
    public VkPipeline getVk(){
        return (VkPipeline) super.getVk();
    }

    public VulkanPipeline(int value){
        super(new VkPipeline(value));
    }

    public static class Array extends VulkanPipeline implements cz.mg.collections.array.ReadonlyArray<VulkanPipeline> {
        public Array(VkPipeline.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipeline.Array(count));
        }

        public Array(int count, VulkanPipeline o){
            this(new VkPipeline.Array(count, o.getVk()));
        }

        @Override
        public VkPipeline.Array getVk(){
            return (VkPipeline.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipeline get(int i){
            return new VulkanPipeline(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipeline.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipeline.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipeline.Pointer(value));
        }

        @Override
        public VkPipeline.Pointer getVk(){
            return (VkPipeline.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipeline.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipeline.Pointer> {
            public Array(int count) {
                super(new VkPipeline.Pointer.Array(count));
            }

            public Array(VulkanPipeline[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipeline.Pointer.Array getVk(){
                return (VkPipeline.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipeline.Pointer get(int i){
                return new VulkanPipeline.Pointer(getVk().get(i));
            }
        }
    }
}
