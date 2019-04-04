package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkEvent.html">khronos documentation</a>
 **/
public class VulkanEvent extends VulkanHandle {
    public VulkanEvent(){
        super(new VkEvent());
    }

    public VulkanEvent(VkEvent vk){
        super(vk);
    }

    @Override
    public VkEvent getVk(){
        return (VkEvent) super.getVk();
    }

    public VulkanEvent(int value){
        super(new VkEvent(value));
    }

    public static class Array extends VulkanEvent implements cz.mg.collections.array.ReadonlyArray<VulkanEvent> {
        public Array(VkEvent.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkEvent.Array(count));
        }

        public Array(int count, VulkanEvent o){
            this(new VkEvent.Array(count, o.getVk()));
        }

        @Override
        public VkEvent.Array getVk(){
            return (VkEvent.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanEvent get(int i){
            return new VulkanEvent(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkEvent.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkEvent.Pointer());
        }

        public Pointer(long value) {
            this(new VkEvent.Pointer(value));
        }

        @Override
        public VkEvent.Pointer getVk(){
            return (VkEvent.Pointer) super.getVk();
        }

        public static class Array extends VulkanEvent.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanEvent.Pointer> {
            public Array(int count) {
                super(new VkEvent.Pointer.Array(count));
            }

            public Array(VulkanEvent[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkEvent.Pointer.Array getVk(){
                return (VkEvent.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanEvent.Pointer get(int i){
                return new VulkanEvent.Pointer(getVk().get(i));
            }
        }
    }
}
