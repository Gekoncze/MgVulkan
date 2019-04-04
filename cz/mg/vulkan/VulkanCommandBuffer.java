package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandBuffer.html">khronos documentation</a>
 **/
public class VulkanCommandBuffer extends VulkanHandle {
    public VulkanCommandBuffer(){
        super(new VkCommandBuffer());
    }

    public VulkanCommandBuffer(VkCommandBuffer vk){
        super(vk);
    }

    @Override
    public VkCommandBuffer getVk(){
        return (VkCommandBuffer) super.getVk();
    }

    public VulkanCommandBuffer(int value){
        super(new VkCommandBuffer(value));
    }

    public static class Array extends VulkanCommandBuffer implements cz.mg.collections.array.ReadonlyArray<VulkanCommandBuffer> {
        public Array(VkCommandBuffer.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCommandBuffer.Array(count));
        }

        public Array(int count, VulkanCommandBuffer o){
            this(new VkCommandBuffer.Array(count, o.getVk()));
        }

        @Override
        public VkCommandBuffer.Array getVk(){
            return (VkCommandBuffer.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCommandBuffer get(int i){
            return new VulkanCommandBuffer(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCommandBuffer.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCommandBuffer.Pointer());
        }

        public Pointer(long value) {
            this(new VkCommandBuffer.Pointer(value));
        }

        @Override
        public VkCommandBuffer.Pointer getVk(){
            return (VkCommandBuffer.Pointer) super.getVk();
        }

        public static class Array extends VulkanCommandBuffer.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCommandBuffer.Pointer> {
            public Array(int count) {
                super(new VkCommandBuffer.Pointer.Array(count));
            }

            public Array(VulkanCommandBuffer[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCommandBuffer.Pointer.Array getVk(){
                return (VkCommandBuffer.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCommandBuffer.Pointer get(int i){
                return new VulkanCommandBuffer.Pointer(getVk().get(i));
            }
        }
    }
}
