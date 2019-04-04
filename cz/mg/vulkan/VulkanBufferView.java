package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBufferView.html">khronos documentation</a>
 **/
public class VulkanBufferView extends VulkanHandle {
    public VulkanBufferView(){
        super(new VkBufferView());
    }

    public VulkanBufferView(VkBufferView vk){
        super(vk);
    }

    @Override
    public VkBufferView getVk(){
        return (VkBufferView) super.getVk();
    }

    public VulkanBufferView(int value){
        super(new VkBufferView(value));
    }

    public static class Array extends VulkanBufferView implements cz.mg.collections.array.ReadonlyArray<VulkanBufferView> {
        public Array(VkBufferView.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBufferView.Array(count));
        }

        public Array(int count, VulkanBufferView o){
            this(new VkBufferView.Array(count, o.getVk()));
        }

        @Override
        public VkBufferView.Array getVk(){
            return (VkBufferView.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBufferView get(int i){
            return new VulkanBufferView(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBufferView.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBufferView.Pointer());
        }

        public Pointer(long value) {
            this(new VkBufferView.Pointer(value));
        }

        @Override
        public VkBufferView.Pointer getVk(){
            return (VkBufferView.Pointer) super.getVk();
        }

        public static class Array extends VulkanBufferView.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBufferView.Pointer> {
            public Array(int count) {
                super(new VkBufferView.Pointer.Array(count));
            }

            public Array(VulkanBufferView[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBufferView.Pointer.Array getVk(){
                return (VkBufferView.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBufferView.Pointer get(int i){
                return new VulkanBufferView.Pointer(getVk().get(i));
            }
        }
    }
}
