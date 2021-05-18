package hust.soict.globalict.aims.screen;
import hust.soict.globalict.aims.media.Media;

import java.awt.Button;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import hust.soict.globalict.aims.cart.Cart.Cart;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartScreenController {
	private Cart cart;
	@FXML
	private TableView<Media> tblMedia;
	@FXML
	private TableColumn<Media, String> cloMediaTitle;
	@FXML
	private TableColumn<Media, String> cloMediaCategory;
	@FXML
	private TableColumn<Media, String> cloMediaCost;
	@FXML
	private Button btnPlay;
	@FXML
	private Button btnRemove;
	@FXML
	private TextField tfFilter;
	@FXML
	private RadioButton radioBtnFilterId;
	@FXML
	private RadioButton radioBtnFilterTitle;
	
	public CartScreenController(Cart cart) {
		super();
		this.cart = cart;
	}
	@FXML
	void btnPlayPressed(ActionEvent event) {
		new Play();
	}
	
	@FXML
	void viewCartPressed(ActionEvent event) {
		new CartScreen(cart);
	}
	
	@FXML
	void addBookPressed(ActionEvent event) {
		new AddBookToStoreScreen(cart);
	}
	
	@FXML
	void addCDPressed(ActionEvent event) {
		new AddCompactDiscToStoreScreen(cart);
	}
	
	@FXML
	void addDVDPressed(ActionEvent event) {
		new AddDigitalVideoDiscToStoreScreen(cart);
	}
	
	@FXML
	void viewStorePressed(ActionEvent event) {
//		new StoreScreen(cart);
	}
	
	
	public class Play {  
		JFrame f;  
		Play(){  
		    f=new JFrame();  
		    JOptionPane.showMessageDialog(f,"Playing.");  
		}  
	
	}
	private void initialize() {
		
		cloMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
		cloMediaCategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
		cloMediaCost.setCellValueFactory(new PropertyValueFactory<Media, String>("cost"));
		
		btnPlay.setVisible(false);
		btnRemove.setVisible(false);
		
		tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>() {

			@Override
			public void changed(ObservableValue<? extends Media> obserValue, Media oldValue, Media newValue) {
				// TODO Auto-generated method stub
				if(newValue!=null) {
					updateButtonBar(newValue);
					
				}
			}
				
		});;
		tfFilter.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observValue, String oldValue, String newValue) {
				// TODO Auto-generated method stub
				showFilteredMedia(newValue);
			}
			
		});
	}
	protected void showFilteredMedia(String newValue) {
		// TODO Auto-generated method stub
		
	}
	void updateButtonBar(Media media) {
		// TODO Auto-generated method stub
		btnRemove.setVisible(true);
		if(media instanceof Playable) {
			btnPlay.setVisible(true);
		}
		else {
			btnRemove.setVisible(false);
		}
	}
	@FXML
	void btnRemovePressed(ActionEvent event) {
		Media media = tblMedia.getSelectionModel().getSelectedItem();
		cart.removeMedia(media.getId());
	}
	
}
