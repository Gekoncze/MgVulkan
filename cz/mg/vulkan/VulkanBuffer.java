package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBuffer.html">khronos documentation</a>
 **/
public class VulkanBuffer extends VulkanHandle {
    public VulkanBuffer(){
        super(new VkBuffer());
    }

    public VulkanBuffer(VkBuffer vk){
        super(vk);
    }

    @Override
    public VkBuffer getVk(){
        return (VkBuffer) super.getVk();
    }

    public VulkanBuffer(int value){
        super(new VkBuffer(value));
    }

    public static class Array extends VulkanBuffer implements cz.mg.collections.array.ReadonlyArray<VulkanBuffer> {
        public Array(VkBuffer.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBuffer.Array(count));
        }

        public Array(int count, VulkanBuffer o){
            this(new VkBuffer.Array(count, o.getVk()));
        }

        @Override
        public VkBuffer.Array getVk(){
            return (VkBuffer.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBuffer get(int i){
            return new VulkanBuffer(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBuffer.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBuffer.Pointer());
        }

        public Pointer(long value) {
            this(new VkBuffer.Pointer(value));
        }

        @Override
        public VkBuffer.Pointer getVk(){
            return (VkBuffer.Pointer) super.getVk();
        }

        public static class Array extends VulkanBuffer.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBuffer.Pointer> {
            public Array(int count) {
                super(new VkBuffer.Pointer.Array(count));
            }

            public Array(VulkanBuffer[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBuffer.Pointer.Array getVk(){
                return (VkBuffer.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBuffer.Pointer get(int i){
                return new VulkanBuffer.Pointer(getVk().get(i));
            }
        }
    }
}
